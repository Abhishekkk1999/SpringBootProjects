package com.apigateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apigateway.model.Model;

public interface SecurityRepository extends JpaRepository<Model, String>{

}
