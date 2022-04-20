package io.cherrytechnologies.photoappapiaccountmanagement.web.controllers

import io.cherrytechnologies.photoappapiaccountmanagement.util.responseOk
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/account-management")
class AccountManagementController {

    @GetMapping("/hello")
    fun greeting() = "Hello form account management".responseOk()
}