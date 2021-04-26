package me.itslucas.bookstore.restcontroller

import org.springframework.http.HttpStatus

import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RequestMapping

import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/secure")
class SecuredController {
    @GetMapping
    fun reachSecureEndpoint(): ResponseEntity<*> {
        return ResponseEntity<Any?>("If your are reading this you reached a secure endpoint", HttpStatus.OK)
    }
}