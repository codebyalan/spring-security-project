package com.ambro.resource.server.controller;

import com.nimbusds.jose.shaded.gson.JsonObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class Api {

    @GetMapping
    public String getRes(Principal principal){

//        JsonObject object = new JsonObject();
//        object.addProperty("Username",principal.getName());

        return principal.getName();
    }

}
