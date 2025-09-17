plugins {
    java
    application
}

group = "org.geysermc.optionalpack"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.13.1")
    implementation("org.reflections:reflections:0.10.2")
}

tasks {
    jar {
        archiveFileName = "GeyserOptionalPackCompiler.jar"
        manifest.attributes["Main-Class"] = application.mainClass
    }
}

application {
    mainClass.set("org.geysermc.optionalpack.OptionalPack")
}
