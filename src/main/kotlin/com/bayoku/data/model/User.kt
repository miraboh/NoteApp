package com.bayoku.data.model

import io.ktor.auth.*

data class User(
    val email:String,
    val hashPassword:String,
    val userName:String
):Principal