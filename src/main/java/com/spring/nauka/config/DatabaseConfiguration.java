package com.spring.nauka.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * Created by Admin on 2017-02-01.
 */

@Configuration
@EnableMongoRepositories("com.spring.nauka.repository")
public class DatabaseConfiguration extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.host}")
    private String host;
    @Value("${spring.data.mongodb.port}")
    private Integer port;
    @Value("${spring.data.mongodb.database}")
    private String database;





    @Override
    public MongoMappingContext mongoMappingContext() throws ClassNotFoundException{
        return super.mongoMappingContext();
    }

    @Override

    protected String getDatabaseName() {
        return database;
    }


    @Override
    @Bean
    public  Mongo mongo() throws Exception {
        return new MongoClient(host+":"+port);

    }
}
