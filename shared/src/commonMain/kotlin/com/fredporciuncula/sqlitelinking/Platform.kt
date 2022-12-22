package com.fredporciuncula.sqlitelinking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform