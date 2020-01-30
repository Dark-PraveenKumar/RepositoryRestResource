package com.repositoryrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.repositoryrest.entity.Xiaomi;

@RepositoryRestResource(collectionResourceRel="pk",path="pk")
public interface XiaomiRepository extends JpaRepository<Xiaomi, Integer> {

}
