package com.lp.test;


import com.lp.App;
import com.lp.sender.OrderSender;
import com.lp.sender.ProductSender;
import com.lp.sender.UserSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {
    @Autowired
    private UserSender userSender;
    @Autowired
    private OrderSender orderSender;
    @Autowired
    private ProductSender productSender;

    @Test
    public void testTopic(){
        userSender.senderSome("userSenderTestStr");
        orderSender.senderSome("orderSenderTestStr");
        productSender.senderSome("productSenderTestStr");

    }


}
