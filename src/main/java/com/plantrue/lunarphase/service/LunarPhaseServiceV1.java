package com.plantrue.lunarphase.service;

import com.plantrue.lunarphase.model.ResponseMessage;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class LunarPhaseServiceV1 implements LunarPhaseService {

    @Override
    public Mono<ResponseMessage> ok() {
        LocalDateTime now = LocalDateTime.now();
        return Mono.just(new ResponseMessage("V1 " + LocalDateTime.now() + " ok."));
    }
}
