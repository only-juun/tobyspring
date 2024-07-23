package onlyjoonspring.hellospring;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @param foreignCurrencyAmount 부동 소수점 타입(float, Double)을 사용하면 안돼
 */
public record Payment(
        Long orderId,
        String currency,
        BigDecimal foreignCurrencyAmount,
        BigDecimal exRate,
        BigDecimal convertedAmount,
        LocalDateTime validUntil
) {
    @Override
    public String toString() {
        return "Payment{" +
                "orderId=" + orderId +
                ", currency='" + currency + '\'' +
                ", foreignCurrencyAmount=" + foreignCurrencyAmount +
                ", exRate=" + exRate +
                ", convertedAmount=" + convertedAmount +
                ", validUntil=" + validUntil +
                '}';
    }
}
