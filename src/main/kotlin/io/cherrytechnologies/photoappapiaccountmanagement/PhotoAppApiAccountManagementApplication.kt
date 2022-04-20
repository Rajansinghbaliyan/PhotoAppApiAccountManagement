package io.cherrytechnologies.photoappapiaccountmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class PhotoAppApiAccountManagementApplication

fun main(args: Array<String>) {
    runApplication<PhotoAppApiAccountManagementApplication>(*args)
}
