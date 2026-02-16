import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.3.0"
    id("io.ktor.plugin") version "3.3.2"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.21"
}

group = "com.example"
version = "0.0.1"

application {
    mainClass = "org.delcom.ApplicationKt"
}

/*
   Versi dependency langsung ditulis di sini
   supaya tidak error karena property tidak ditemukan
*/

val ktor_version = "3.3.2"
val koin_version = "3.5.6"
val logback_version = "1.4.14"
val kotlin_version = "2.3.0"

dependencies {

    // KTOR
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-status-pages-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-cors-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-config-yaml-jvm:$ktor_version")

    // KOIN
    implementation("io.insert-koin:koin-ktor:$koin_version")
    implementation("io.insert-koin:koin-logger-slf4j:$koin_version")

    // LOGGING
    implementation("ch.qos.logback:logback-classic:$logback_version")

    // DOTENV (FIXED — tidak pakai dotenv_version lagi)
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")

    // DATETIME
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")

    // TEST
    testImplementation("io.ktor:ktor-server-test-host-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}

