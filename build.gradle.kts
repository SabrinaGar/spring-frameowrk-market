plugins {
	java
	id("org.springframework.boot") version "2.5.5"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.platzi"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("io.springfox:springfox-swagger2:2.9.2")
	implementation("io.springfox:springfox-swagger-ui:2.9.2")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation ("org.mapstruct:mapstruct:1.5.3.Final")
	annotationProcessor ("org.mapstruct:mapstruct-processor:1.5.3.Final")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
