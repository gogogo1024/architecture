package com.example.demo;

import com.example.demo.callback.InstanceCallbackDigestUserInterface;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CallbackTests {
    @Test
    void callbackInstanceTest() {
        String[] filenames = {"README.md", "pom.xml", "mvnw.cmd"};
        for (String filename : filenames) {
            // Calculate the digest
            InstanceCallbackDigestUserInterface d = new InstanceCallbackDigestUserInterface(filename);
            d.calculateDigest();
        }

    }
}
