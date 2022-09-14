package com.maneesh.allocationservice.controller;


import com.maneesh.allocationservice.repository.AllocationRepository;
import com.maneesh.allocationservice.service.AllocationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allocation")
@AllArgsConstructor
@Slf4j
public class AllocationController {

    public AllocationRepository allocationRepository;
    private AllocationService allocationService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Double getVolume(Integer id){

        return  allocationRepository.findById(1).get().getVolume();
    }

}
