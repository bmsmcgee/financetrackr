package com.financetrackr.backend.resolver;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloResolver {

    @QueryMapping
    public String hello() {
        return "GraphQL is working!";
    }
}