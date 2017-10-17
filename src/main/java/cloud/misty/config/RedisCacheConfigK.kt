package cloud.misty.config

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.interceptor.KeyGenerator
import org.springframework.context.annotation.Bean
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer
import java.lang.reflect.Method

/**
 * @author xieyuejun
 * @created 2017/10/13
 */
@EnableCaching
@EnableAutoConfiguration
class RedisCacheConfigK {
    /**
     * CacheKey Generator
     */
    @Bean
    fun systemKeyGenerator() = object : KeyGenerator {
        override fun generate(target: Any?, method: Method?, vararg params: Any?) = ""
    }


    @Bean
    fun redisTemplate(): RedisTemplate<String, String> {
        var redisTemplate = RedisTemplate<String, String>()
        redisTemplate.stringSerializer

        return redisTemplate
    }

}