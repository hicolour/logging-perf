package com.one.two.three.four.five.six.seve.eight.nine.ten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.stream.IntStream;

/**
 * Created by marek on 9/15/16.
 */
public class A  {


    public static Logger log  = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void log() {



        while (true) {
            IntStream.range(0, 3000).parallel().forEach(x ->
                    IntStream.range(0, 3000).parallel().forEach(a -> {

                        log.info("Loggind info{}", a);
                        log.warn("Loggind warn {}", a);
                        try {
                            Thread.sleep(3);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }));
        }
    }
}