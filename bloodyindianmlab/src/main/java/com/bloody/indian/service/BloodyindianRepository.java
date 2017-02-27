package com.bloody.indian.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by dakshinamoorthyd on 05-12-2016.
 */
//@RepositoryRestResource(collectionResourceRel = "sfaint", path = "sfaint")
public interface BloodyindianRepository extends MongoRepository<BloodyIndian, String> {

    @Query(value = "{ 'orderId' : ?0 }")
    public BloodyIndian findBloodyIndianByOrderId(String orderId);

}
