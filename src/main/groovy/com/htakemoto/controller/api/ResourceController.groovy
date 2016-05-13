package com.htakemoto.controller.api

import com.htakemoto.resource.UserResource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/api/1.0")
class ResourceController {

    @Autowired UserResource userResource

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    def getUsers() {
        userResource.getUsers()
    }
}
