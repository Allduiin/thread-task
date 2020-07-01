package project.threads;

import org.apache.log4j.Logger;
import project.model.Counter;

public class ThreadClass extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadClass.class);
    private final int FINISH = 100;
    private final Counter counter;

    public ThreadClass(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < FINISH) {
            counter.setCounter(counter.getCounter() + 1);
            LOGGER.info("ThreadClass " + counter.getCounter());
        }
    }
}
