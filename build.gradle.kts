plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.testng:testng:7.7.1") // Библиотека TestNG
    testImplementation(kotlin("test")) // Библиотека для тестирования на Kotlin
}

tasks.test {
    useJUnitPlatform()
}