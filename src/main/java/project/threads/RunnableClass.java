package project.threads;

import org.apache.log4j.Logger;
import project.model.Counter;

public class RunnableClass implements Runnable{
    private static final Logger LOGGER = Logger.getLogger(RunnableClass.class);
    private final int FINISH = 100;
    private final Counter counter;

    public RunnableClass(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < FINISH) {
            counter.setCounter(counter.getCounter() + 1);
            LOGGER.info("Runnable " + counter.getCounter());
        }
    }
}
