plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    // Укажите имя класса с main-функцией (без пакета): MainKt
    mainClass.set("MainKt")
}
