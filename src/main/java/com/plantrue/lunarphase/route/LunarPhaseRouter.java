package com.plantrue.lunarphase.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class LunarPhaseRouter {

    @Autowired
    private LunarPhaseHandler handler;

    @Bean
    RouterFunction<ServerResponse> route() {
        return RouterFunctions
                .route(GET("/ok"), handler::ok);
    }
}
