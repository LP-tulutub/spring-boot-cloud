package com.lp.test;


import com.lp.App;
import com.lp.sender.BroadcastSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {
    @Autowired
    private BroadcastSender broadcastSender;

    @Test
    public void test(){
        this.broadcastSender.senderBroadcast("广播信息");
    }


}
