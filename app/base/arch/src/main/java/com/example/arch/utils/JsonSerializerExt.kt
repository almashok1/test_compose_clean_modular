package com.example.arch.utils

import com.example.arch.api.JsonSerializer

inline fun<reified T> JsonSerializer.fromJson(string: String?) = jsonToObject(T::class.java, string)

inline fun<reified T> JsonSerializer.toJson(item: T?) = objectToJson(T::class.java, item)