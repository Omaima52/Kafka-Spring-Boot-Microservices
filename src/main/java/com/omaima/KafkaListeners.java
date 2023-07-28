package com.omaima;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    //groupId so that if we scale (have more instances of the same app), they can read from the same partition or topic
    @KafkaListener(topics = "omaima", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received : " + data + " :)");
    }
}
