package com.samsl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExecutionService {
    public Object executor(){
      return true;
    }

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }

}

