package com.example.UserManagement.Serviceb.adapter.repository;

import com.example.UserManagement.Serviceb.rest.model.User;

import java.util.Optional;

public interface UserManagement {
    public Optional<String> getUserNameById(String id);
}
