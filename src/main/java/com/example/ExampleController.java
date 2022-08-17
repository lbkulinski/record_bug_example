package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller("/api/example")
public class ExampleController {
    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<?> example(@Valid @RequestBean Bean bean) {
        return HttpResponse.ok(
            Map.of(
                "bean", bean.toString()
            )
        );
    } //example
}