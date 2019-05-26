package com.fredoliveira;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    public AsyncService() {
    }

    @Async
    public void executeAsync(String text) {
        logger.info("Running {} at thread: {}", text, Thread.currentThread().getName());
    }

}
