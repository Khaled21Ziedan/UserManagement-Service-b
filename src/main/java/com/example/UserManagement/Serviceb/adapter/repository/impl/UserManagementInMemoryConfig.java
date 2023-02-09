package com.example.UserManagement.Serviceb.adapter.repository.impl;

import com.example.UserManagement.Serviceb.adapter.repository.UserManagement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagementInMemoryConfig {
    @Bean
    public UserManagement InMemoryUM() {
        return new UserManagementInMemory();
    }
}