package lemon.onlinemall.config;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.context.annotation.Configuration;


/**
 * MyBatis配置类
 * <p>
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("com.macro.onlinemall.tiny.mbg.mapper")
public class MyBatisConfig {

}
