plugins {
	alias(libs.plugins.shadow)
}

dependencies {
	implementation(project(path = ":vane-portals", configuration = "runtimeElements"))
	compileOnly(libs.vault)
	compileOnly(libs.json)
}

tasks {
    shadowJar {
        configurations = listOf()
        relocate("org.json", "org.oddlama.vane.external.json")
    }
}
