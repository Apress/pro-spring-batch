package com.apress.springbatch.chapter4;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MessageTasklet implements Tasklet {

    private String message;
    
    public void setMessage(String message) {
        this.message = message;
    }

    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
            throws Exception {
        System.out.println(message);
        
        return RepeatStatus.FINISHED;
    }

}
