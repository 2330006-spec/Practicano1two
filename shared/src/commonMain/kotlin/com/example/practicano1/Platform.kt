package com.example.practicano1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform