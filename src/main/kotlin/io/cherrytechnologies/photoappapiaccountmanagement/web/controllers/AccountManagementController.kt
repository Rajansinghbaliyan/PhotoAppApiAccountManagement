package io.cherrytechnologies.photoappapiaccountmanagement.web.controllers

import io.cherrytechnologies.photoappapiaccountmanagement.util.logInfo
import io.cherrytechnologies.photoappapiaccountmanagement.util.responseOk
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Logger

@RestController
@RequestMapping("/account")
class AccountManagementController {

    val log: Logger = Logger.getLogger(AccountManagementController::class.toString())

    @GetMapping("/hello")
    fun greeting() = "Hello form account management".responseOk().logInfo(log,"GET: account-management")
}