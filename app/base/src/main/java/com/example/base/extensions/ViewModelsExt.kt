package com.example.base.extensions

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.arch.models.Outcome
import com.example.arch.models.OutcomeState
import com.example.data.Stated
import kotlin.coroutines.CoroutineContext

fun<T> ViewModel.getState(
    context: CoroutineContext = viewModelScope.coroutineContext,
    action: (suspend () -> Outcome<T>)? = null
) = Stated(scope = viewModelScope, context = context, action = action)

inline val<T> Stated<T>.liveData: LiveData<OutcomeState<T>> get() = flow.asLiveData()