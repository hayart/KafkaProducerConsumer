package am.hayk.developer.service;

import dto.MessageDto;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class KafkaService {
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void sendEvent(){
        kafkaTemplate.send("event-topic", new MessageDto("some text or object"));
    }
}
