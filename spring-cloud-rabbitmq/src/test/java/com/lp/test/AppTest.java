package com.lp.test;

import com.lp.App;
import com.lp.producter.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {
    @Autowired
    private Sender sender;

    /**
     * 测试
     */
    @Test
    public void test1(){
        sender.send("学习测试RabbitMQ");
    }

    @Test
    public void test2() throws InterruptedException {
        while (true){
            Thread.sleep(2000);
            sender.send("学习测试RabbitMQ");
        }

    }

}
