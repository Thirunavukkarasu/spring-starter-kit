package com.example.hellojob;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
// Create conditional annoation based on application.properties
@ConditionalOnProperty(name = "app.job_type", havingValue = "cron", matchIfMissing = true)
public class CronJobScheduler {
    public CronJobScheduler() {
        System.out.println("CronJobScheduler constructor called");
    }

    @Bean
    public void helloOne() {
        System.out.println("CronJobScheduler hello method called");
    }
}
