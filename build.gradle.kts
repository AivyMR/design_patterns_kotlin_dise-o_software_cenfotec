plugins {
    kotlin("jvm") version "1.9.23"
}

group = "io.github.kevinah95"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}
