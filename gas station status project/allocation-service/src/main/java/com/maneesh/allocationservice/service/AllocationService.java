package com.maneesh.allocationservice.service;


import com.maneesh.allocationservice.model.Store;
import com.maneesh.allocationservice.repository.AllocationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class AllocationService {

    private final AllocationRepository allocationRepository;

    public Optional<Store>  getVolume(int id){
        return allocationRepository.findById(id);
    }



}
