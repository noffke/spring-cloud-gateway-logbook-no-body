package com.example.springcloudgatewaylogbook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringCloudGatewayLogbookApplication {
	@Bean
	fun routeLocator(builder: RouteLocatorBuilder) = builder.routes {
		route(id = "soap") {
			path("/**")
			uri("https://www.google.com")
		}
	}
}

fun main(args: Array<String>) {
	runApplication<SpringCloudGatewayLogbookApplication>(*args)
}
