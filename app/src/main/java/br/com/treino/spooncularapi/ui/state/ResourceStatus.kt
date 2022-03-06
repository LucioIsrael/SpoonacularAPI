package br.com.treino.spooncularapi.ui.state

sealed class ResourceStatus <T> (
    val data: T? = null,
    val message: String? = null,
) {
    class Sucess<T>(data: T): ResourceStatus<T>(data)
    class Error<T>(message: String, data: T? = null): ResourceStatus<T>(data, message)
    class Loading<T> : ResourceStatus<T>()
    class Empty<T> : ResourceStatus<T>()
}