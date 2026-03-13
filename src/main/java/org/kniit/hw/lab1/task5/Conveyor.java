package org.kniit.hw.lab1.task5;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Conveyor {
    BlockingQueue<String> rawDetails = new LinkedBlockingQueue<>(5);
    BlockingQueue<String> readyDetails = new LinkedBlockingQueue<>(5);
}
