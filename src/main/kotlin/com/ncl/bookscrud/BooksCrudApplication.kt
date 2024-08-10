package com.ncl.bookscrud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksCrudApplication

fun main(args: Array<String>) {
	runApplication<BooksCrudApplication>(*args)
}
