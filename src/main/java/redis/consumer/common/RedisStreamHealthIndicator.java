package redis.consumer.common;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import redis.consumer.service.RedisStreamConsumer;

@Component
@RequiredArgsConstructor
public class RedisStreamHealthIndicator implements HealthIndicator {
    private final RedisStreamConsumer redisStreamConsumer;

    @Override
    public Health health() {
        return (redisStreamConsumer.isSubscriptionActive() ? Health.up() : Health.down()).build();
    }
}
