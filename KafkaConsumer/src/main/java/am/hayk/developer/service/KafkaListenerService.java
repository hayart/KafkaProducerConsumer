package am.hayk.developer.service;

import am.hayk.developer.dto.MessageDto;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class KafkaListenerService {

    @KafkaListener(topics = "event-topic",groupId = "event-group")
    public void processProductEvents(MessageDto msg) {
        System.out.println(msg.getMessage());
    }
}
