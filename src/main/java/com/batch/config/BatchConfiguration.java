package com.batch.config;

import com.batch.steps.ItemReaderStep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfiguration {

    @Bean
    public ItemReaderStep iteamReaderStep(){
        return new ItemReaderStep();
    }
}
