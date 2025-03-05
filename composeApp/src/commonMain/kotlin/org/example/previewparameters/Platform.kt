package org.example.previewparameters

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform