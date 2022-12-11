package com.plantrue.lunarphase.service;

import com.plantrue.lunarphase.model.ResponseMessage;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

public interface LunarPhaseService {
    Mono<ResponseMessage> ok();
}
