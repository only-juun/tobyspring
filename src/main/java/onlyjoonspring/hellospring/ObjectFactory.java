package onlyjoonspring.hellospring;

import onlyjoonspring.hellospring.exrate.CachedExRateProvider;
import onlyjoonspring.hellospring.payment.ExRateProvider;
import onlyjoonspring.hellospring.exrate.WebApiExRateProvider;
import onlyjoonspring.hellospring.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFactory {
    @Bean
    public PaymentService paymentService() {
        return new PaymentService(cachedExRateProvider());
    }

    @Bean
    public ExRateProvider cachedExRateProvider() {
        return new CachedExRateProvider(exRageProvider());
    }

    @Bean
    public ExRateProvider exRageProvider() {
        return new WebApiExRateProvider();
    }
}
