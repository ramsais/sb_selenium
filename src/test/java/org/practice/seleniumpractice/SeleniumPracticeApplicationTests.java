package org.practice.seleniumpractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumPracticeApplicationTests {

    @Autowired
    private WebDriver webDriver;

//    @Test
//    void contextLoads() {
//        System.out.println("TESTING");
//    }

    @Test
    void openUTube() {
        webDriver.navigate().to("https://www.youtube.com/results?search_query=inthandham+song");
    }

}
