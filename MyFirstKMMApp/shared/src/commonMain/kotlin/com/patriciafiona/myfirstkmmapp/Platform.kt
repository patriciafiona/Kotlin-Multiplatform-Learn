package com.patriciafiona.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform