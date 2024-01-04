package com.example.hellojob;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
// Create conditional annoation based on application.properties
@ConditionalOnProperty(name = "app.job_type", havingValue = "one_time", matchIfMissing = true)
public class OneTimeJobScheduler {
    public OneTimeJobScheduler() {
        System.out.println("OneTimeJobScheduler constructor called");
    }

    @Bean
    public void helloTwo() {
        System.out.println("OneTimeJobScheduler hello method called");
    }
}
