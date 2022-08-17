package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.PathVariable;

import javax.validation.constraints.Positive;

@Introspected
public record Bean(HttpRequest<?> httpRequest, @PathVariable @Nullable @Positive Integer id) {
}