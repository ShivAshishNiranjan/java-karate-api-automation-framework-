package com.shivashish.tests;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RunAllTests {

    @Test
    void runAll() {
        // Read the value that karate-config.js set; default to 2 if missing
        int threads = Integer.parseInt(System.getProperty("karate.threads", "3"));

        Results results = Runner.path("classpath:features")
                .tags("@resreq") // optional
                .parallel(threads);

        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}
