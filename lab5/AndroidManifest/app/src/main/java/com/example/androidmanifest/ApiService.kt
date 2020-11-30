package com.example.androidmanifest
import retrofit2.Call
import retrofit2.http.*
import kotlin.collections.MutableList as MutableList1

interface ApiService {
    @GET("todos")
    fun getAllTodos(): Call<MutableList1<Todo>>

    @GET("todos/{id}/")
    fun getTodoById(@Path("id") todoId: Int?): Call<Todo>

    @FormUrlEncoded
    @POST("todos")
    fun addTask(
        @Field("title") title: String,
        @Field("completed") completed: String,
        @Field("detailedInfo") detailedInfo:String
    ): Call<Todo>

    @GET("users/{id}/")
    fun getUser(@Path("id") userId: Int): Call<User>
}