fun main() {
    //sealed class
    val response = callRestApi()
    when(response) {
        is ApiResult.Success -> {
            println(response.data)
        }
        is ApiResult.Error -> {
            println(response.msg)
        }
    }
}

fun callRestApi() : ApiResult {
    val res = (0..1).random()
    if (res == 0) {
        return ApiResult.Error("404")
    }
    return ApiResult.Success(200)
}

sealed class ApiResult {
    data class Success(val data: Int) : ApiResult()
    data class Error(val msg: String) : ApiResult()
}