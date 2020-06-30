package project.threads;

import org.apache.log4j.Logger;
import project.model.Counter;

public class RunnableClass implements Runnable{
    private final Logger LOGGER = Logger.getLogger(ThreadClass.class);
    private final int START = 0;
    private final int FINISH = 100;
    private final Counter counter;

    public RunnableClass(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = START; i < FINISH; i++) {
            counter.setCounter(counter.getCounter() + 1);
            LOGGER.info("RunnableClass " + counter.getCounter());
        }
    }
}