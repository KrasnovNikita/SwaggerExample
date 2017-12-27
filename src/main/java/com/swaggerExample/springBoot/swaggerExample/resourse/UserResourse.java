package com.swaggerExample.springBoot.swaggerExample.resourse;

import com.swaggerExample.springBoot.swaggerExample.entity.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author N. Krasnov created on 26.12.2017
 */
@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resource", description = "Shows User information")
public class UserResourse {

    @GetMapping
    public List<User> getUsers(){

        return Arrays.asList(
                new User("Petya", 20000),
                new User("Kolya",25000)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){

        return new User(userName, 1500);
    }

}
