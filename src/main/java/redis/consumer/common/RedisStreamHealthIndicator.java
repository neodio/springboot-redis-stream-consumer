package redis.consumer.common;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import redis.consumer.config.RedisConfig;

@Component
@RequiredArgsConstructor
public class RedisStreamHealthIndicator implements HealthIndicator {
    private final RedisConfig redisConfig;

    @Override
    public Health health() {
        return (redisConfig.isSubscriptionActive() ? Health.up() : Health.down()).build();
    }
}
