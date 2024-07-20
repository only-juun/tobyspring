package onlyjoonspring.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFactory {
    @Bean
    public PaymentService paymentService() {
        return new PaymentService(exRageProvider());
    }

    @Bean
    public ExRateProvider exRageProvider() {
        return new SimpleExRateProvider();
    }
}
