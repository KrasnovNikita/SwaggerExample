package com.swaggerExample.springBoot.swaggerExample.resourse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author N. Krasnov created on 26.12.2017
 */
@RestController
@RequestMapping("/rest/hello")
@Api(value="Hello World Resource", description = "Shows Hello World")
public class HelloResourse {

    @ApiOperation(value="method hello() returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 300, message = "300 is the message")
            }
    )
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PutMapping("/put1")
    public void test(){
    }

    @PostMapping("/post")
    public String helloPost(@ApiParam(value="Hello world string", required = true) @RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }

}
