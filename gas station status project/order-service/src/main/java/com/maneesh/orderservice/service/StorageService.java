package com.maneesh.orderservice.service;

import com.maneesh.orderservice.model.StorageCapacity;
import com.maneesh.orderservice.repository.StorageRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StorageService {

    private StorageRepository storageRepository;
//    @Bean
//    public WebClient webClient(){
//        return WebClient.builder().build();
//    }

    public Optional<StorageCapacity> getVolume(int id){
        return storageRepository.findById(id);

    }




}
