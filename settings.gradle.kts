plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}
rootProject.name = "sonar-kotlin-bug-2"
include("java-module")
include("kotlin-module")
