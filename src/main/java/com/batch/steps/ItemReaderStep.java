package com.batch.steps;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.Nullable;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.StepContribution;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.infrastructure.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

import java.io.FileReader;
import java.io.Reader;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@Slf4j
public class ItemReaderStep implements Tasklet {

    @Autowired
    private ResourceLoader rl;

    @Override
    public @Nullable RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("<----------- INICIA LECTURA----------->");

        Reader reader = new FileReader(rl.getResource("classpath:files/destination/persons.csv").getFile());

        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();


        return null;
    }
}
