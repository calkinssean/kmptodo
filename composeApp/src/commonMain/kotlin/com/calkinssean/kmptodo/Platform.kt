package com.calkinssean.kmptodo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform