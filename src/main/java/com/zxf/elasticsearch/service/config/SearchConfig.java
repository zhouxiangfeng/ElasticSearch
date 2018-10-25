package com.zxf.elasticsearch.service.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.zxf.elasticsearch.dao")
public class SearchConfig {

}
