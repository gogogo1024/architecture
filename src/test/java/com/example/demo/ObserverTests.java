package com.example.demo;

import com.example.demo.pattern.observer.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class ObserverTests {

    /**
     * 模拟一场文字直播球赛测试
     */
    @Test
    void observerTest() {
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "NBA Match [2023January13] [rocket vs knight]");

        Observer observer1 = new SMSUsers(subject, "gogogo1024-32-yichun");
        observer1.subscribe();
        System.out.println();

        Observer observer2 = new SMSUsers(subject, "wuxia-29-yichun");
        observer2.subscribe();

        Commentary commentary = (Commentary) subject;
        commentary.setDesc("Welcome to live nba match");
        commentary.setDesc("Current score 80-86");
        System.out.println();


        observer2.unSubscribe();
        System.out.println();

        commentary.setDesc("james catch the ball");
        commentary.setDesc("bang");
        System.out.println();

        Observer observer3 = new SMSUsers(subject, "laofa-59-yichun");
        observer3.subscribe();
        commentary.setDesc("game is over");
        System.out.println();

    }
}
