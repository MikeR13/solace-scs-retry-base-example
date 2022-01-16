package ch.mrt.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import javax.validation.ValidationException;
import java.util.function.Consumer;

@Configuration
public class MessagingConsumerConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(MessagingConsumerConfiguration.class);

    @Bean
    public Consumer<Message<String>> dummy() {
        return message -> {
            LOG.info("Got message: {} with headers {}", message.getPayload(), message.getHeaders());
            throw new ValidationException("What ever");
        };
    }

}
