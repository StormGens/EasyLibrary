pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android.tools.build") {
                useModule("com.android.tools.build:gradle:4.1.2")
            }
//            if (requested.id.namespace == "org.jetbrains.kotlin") {
//                val kotlin_version = "1.8.10"
//                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//            }
//            if (requested.id.namespace == "com.github.dcendents") {
//                useModule("com.github.dcendents:android-maven-gradle-plugin:1.5")
//            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.aliyun.com/repository/jcenter")
    }
}

rootProject.name = "EasyLibrary"
include(":app")
include(":easyutil")
