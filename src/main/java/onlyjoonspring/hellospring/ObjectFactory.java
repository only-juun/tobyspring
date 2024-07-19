package onlyjoonspring.hellospring;

public class ObjectFactory {
    public PaymentService paymentService() {
        return new PaymentService(exRageProvider());
    }

    public ExRateProvider exRageProvider() {
        return new WebApiExRateProvider();
    }
}
