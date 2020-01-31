package com.lp.receiver;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DemoReceiverService {
    @Input("myInput")
    SubscribableChannel myInput();
}
