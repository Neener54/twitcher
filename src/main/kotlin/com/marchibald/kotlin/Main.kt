package com.marchibald.kotlin

/**
 * Created by marchibald on 6/5/17.
 */
import spark.Spark.*

class Main {
    fun main(args: Array<String>) {
        get("hello") {req, res -> "Hello World"}
    }
}



