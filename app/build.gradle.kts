plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.31"
    id("com.dua3.javafxgradle7plugin") version "0.0.9"
    id("org.beryx.jlink") version "2.23.1"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:30.0-jre")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClass.set("com.tangkeys.kbdcfg.KeyboardConfiguratorKt")
    mainModule.set("KeyboardConfigurator")
}

javafx {
    version = "16"
    modules = listOf(
        "javafx.controls",
        "javafx.graphics"
    )
}

jlink {
    launcher {
        name = "kbdcfg"
    }
}