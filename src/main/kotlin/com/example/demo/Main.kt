package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.http.server.reactive.HttpHandler
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Mono
import reactor.netty.http.server.HttpServer

@SpringBootApplication
class ReactorDemoApplication

fun main(args: Array<String>) {
    runApplication<ReactorDemoApplication>(*args)

//    val router: RouterFunction<ServerResponse> = router {
//        GET("/hello", accept(MediaType.TEXT_PLAIN)) { request ->
//            ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//                .body(BodyInserters.fromValue("Hello, WebFlux!"))
//        }
//    }
//
//    val handler: HttpHandler = RouterFunctions.toHttpHandler(router)
//    val adapter = ReactorHttpHandlerAdapter(handler)
//    HttpServer.create().host("127.0.0.1").port(8080).handle(adapter).bindNow().onDispose().block()
}
