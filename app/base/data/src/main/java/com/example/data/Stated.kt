package com.example.data

import com.example.arch.models.Outcome
import com.example.arch.models.OutcomeState
import com.example.arch.utils.onError
import com.example.arch.utils.onSuccess
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class Stated<T>(
    private val scope: CoroutineScope,
    private val context: CoroutineContext = scope.coroutineContext,
    private val action: (suspend () -> Outcome<T>)? = null
) {

    private val _result = MutableStateFlow<OutcomeState<T>>(OutcomeState.Idle)
    val flow: Flow<OutcomeState<T>> get() = _result

    val current: OutcomeState<T> get() = _result.value

    fun request(): Stated<T> {
        action?.let { request(it) }
        return this
    }

    fun request(action: suspend () -> Outcome<T>): Stated<T> {
        scope.launch(context) {
            _result.value = OutcomeState.Loading
            action.invoke().onSuccess { data ->
                _result.value = OutcomeState.Success(data)
            }.onError { error ->
                _result.value = OutcomeState.Error(error)
            }
        }
        return this
    }

    fun post(newOutcomeState: OutcomeState<T>): Stated<T> {
        _result.value = newOutcomeState
        return this
    }
}