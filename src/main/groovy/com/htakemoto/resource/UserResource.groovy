package com.htakemoto.resource

import org.springframework.stereotype.Component

@Component
class UserResource {

    def getUsers() {
        def users = []
        users.add(["id":1,"name":"Bob"])
        users.add(["id":2,"name":"John"])
        users.add(["id":3,"name":"Jennifer"])
        users.add(["id":4,"name":"Leo"])
        return users
    }
}
