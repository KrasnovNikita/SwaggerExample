package com.swaggerExample.springBoot.swaggerExample.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author N. Krasnov created on 26.12.2017
 */

public class User {

    @ApiModelProperty(notes = "Name of the user")
    private String userName;

    @ApiModelProperty(notes = "Salary of the user")
    private int salary;

    public User(String userName, int salary) {
        this.userName = userName;
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public int getSalary() {
        return salary;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
