package dev.alexandrelfreitas.dbinitialization

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbinitializationApplication

fun main(args: Array<String>) {
	runApplication<DbinitializationApplication>(*args)
}
