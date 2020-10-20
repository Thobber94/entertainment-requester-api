package net.bergby.entertainmentrequesterapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["net.bergby"])
class EntertainmentRequesterApiApplication

fun main(args: Array<String>) {
	runApplication<EntertainmentRequesterApiApplication>(*args)
}
