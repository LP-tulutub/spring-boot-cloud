package com.lp.test;

import com.lp.App;
import com.lp.sender.Sender;
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
     * 测试info消息队列
     */
    @Test
    public void testInfo() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sender.senderInfo("学习测试RabbitMQ");
        }
    }

    /**
     * 测试error消息队列
     */
    @Test
    public void testError() throws InterruptedException {
        while (true){
            Thread.sleep(2000);
            sender.senderError("学习测试RabbitMQ");
        }
    }

}
