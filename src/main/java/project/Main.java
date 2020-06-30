package project;

import project.model.Counter;
import project.threads.RunnableClass;
import project.threads.ThreadClass;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new ThreadClass(counter);
        Runnable runnable = new RunnableClass(counter);
        Thread runnableThread = new Thread(runnable);
        thread.start();
        runnableThread.start();
    }
}
