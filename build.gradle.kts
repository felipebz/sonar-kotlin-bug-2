plugins {
    id("org.sonarqube") version "4.4.1.3373"
}

group = "com.felipebz"
version = "1.0-SNAPSHOT"

sonar {
    properties {
        property("sonar.projectKey", "felipebz-github_sonar-kotlin-bug-2")
        property("sonar.organization", "felipebz-github")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}