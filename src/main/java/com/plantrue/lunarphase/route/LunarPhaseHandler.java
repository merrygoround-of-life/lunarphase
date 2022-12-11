package com.plantrue.lunarphase.route;

import com.plantrue.lunarphase.model.ResponseMessage;
import com.plantrue.lunarphase.service.LunarPhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class LunarPhaseHandler {

    @Autowired
    private LunarPhaseService service;

    Mono<ServerResponse> ok(ServerRequest request) {
        return ServerResponse.ok().body(service.ok(), ResponseMessage.class);
    }
}
