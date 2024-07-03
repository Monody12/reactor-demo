package com.example.demo.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
class TestController {

    @RequestMapping("/hello")
    fun hello() : Mono<String>{
        return Mono.just("Hello World")
    }

    @RequestMapping(value = ["/sse"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun sse(): Flux<String> {
        return Flux.range(1,10)
            .map { "数据：$it" }
            .delayElements(Duration.ofMillis(300))
    }
}