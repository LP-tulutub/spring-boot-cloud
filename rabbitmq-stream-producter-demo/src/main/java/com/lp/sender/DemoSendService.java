package com.lp.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface DemoSendService {
    @Output("myInput")
    SubscribableChannel sendOrder();
}
