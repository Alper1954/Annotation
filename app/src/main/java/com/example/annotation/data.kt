package com.example.annotation

//Declaration des annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class SourceData(val author : String,
                            val version : Int,
                            val lastModified: String)

@Target(AnnotationTarget.FIELD)
annotation class Positive

@Target(AnnotationTarget.FIELD)
annotation class AllowedNames(val names: Array<String>)


//Classes annotatées

@SourceData(
    author = "Benedict Cumberbatch",
    version = 1,
    lastModified = "2018-05-09")
class MyClass {
    fun getHelloString(): String {
        return "Hello World!"
    }
}


class Item(
    @Positive val amount: Float,
    @AllowedNames(["Alice", "Bob"]) val name: String)



