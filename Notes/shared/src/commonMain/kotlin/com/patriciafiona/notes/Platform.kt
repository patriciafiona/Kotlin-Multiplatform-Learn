package com.patriciafiona.notes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform