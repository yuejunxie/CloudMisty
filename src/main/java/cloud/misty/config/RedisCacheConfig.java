package cloud.misty.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

/**
 * @author xieyuejun
 * @created 2017/10/12
 * <p>
 * RedisCache配置
 */
@EnableAutoConfiguration
@EnableCaching
public class RedisCacheConfig {
    @Bean
    public KeyGenerator systemKeyGenerator(){
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                return "session";
            }
        };
    }
}
