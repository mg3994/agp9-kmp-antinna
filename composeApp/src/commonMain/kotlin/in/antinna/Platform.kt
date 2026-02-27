package `in`.antinna

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform