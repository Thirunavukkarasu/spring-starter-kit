package com.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import brave.Span;
import brave.Tracer;
import brave.Tracer.SpanInScope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SleuthService {
    public static Logger logger = LoggerFactory.getLogger(SleuthController.class);
    private final Tracer tracer;

    @Autowired
    public SleuthService(Tracer tracer) {
        this.tracer = tracer;
    }

    public void doSomeWorkSameSpan() throws InterruptedException {
        Thread.sleep(1000L);
        logger.info("Doing some work");
    }

    public void doSomeWorkNewSpan() throws InterruptedException {
        logger.info("I'm in the original span");

        Span newSpan = tracer.nextSpan().name("newSpan").start();
        try (SpanInScope ws = tracer.withSpanInScope(newSpan.start())) {
            Thread.sleep(1000L);
            logger.info("I'm in the new span doing some cool work that needs its own span");
        } finally {
            newSpan.finish();
        }

        logger.info("I'm in the original span");
    }

    @Async
    public void asyncMethod() throws InterruptedException {
        logger.info("Start Async Method");
        Thread.sleep(1000L);
        logger.info("End Async Method");
    }
}
