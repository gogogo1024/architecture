package com.example.demo;

import com.example.demo.URL.URLUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class URLTests {
    @Test
    void judgeContentTest() throws IOException {
        URLUtil.judgeContent();
    }
}
