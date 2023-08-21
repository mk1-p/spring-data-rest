package com.example.rest.global.common;

import com.example.rest.domain.members.MemberEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Bean
    MemberEventHandler memberEventHandler() {
        return new MemberEventHandler();
    }

}
