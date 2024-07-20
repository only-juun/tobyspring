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
    public OrderService orderService() {
        return new OrderService(exRageProvider());
    }

    @Bean
    public ExRateProvider exRageProvider() {
        return new SimpleExRateProvider();
    }
}

class OrderService {
    ExRateProvider exRateProvider;

    public OrderService(ExRateProvider exRateProvider) {
        this.exRateProvider = exRateProvider;
    }
}
