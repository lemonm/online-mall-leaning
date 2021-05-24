package com.lemon.onlinemall.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * author : Lemon
 * 2021/5/22 13:25
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

    public IgnoreUrlsConfig() {
        List<String> ignoreUrls = new ArrayList<>();
        ignoreUrls.add("/");
        ignoreUrls.add("/v2/api-docs/**");
        ignoreUrls.add("/swagger-ui.html/**");
        ignoreUrls.add("/swagger-resources/**");
        ignoreUrls.add("/webjars/**");
        ignoreUrls.add("/csrf/**");
        setUrls(ignoreUrls);
    }
}