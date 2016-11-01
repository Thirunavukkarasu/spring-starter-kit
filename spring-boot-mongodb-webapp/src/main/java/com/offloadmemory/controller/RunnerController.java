package com.offloadmemory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.offloadmemory.model.Runner;
import com.offloadmemory.repository.RunnerRepository;

@RestController
public class RunnerController {
    @Autowired
    RunnerRepository runnerRepository;
    
    @RequestMapping(value = "/runners", method = RequestMethod.GET)
    public Page<Runner>  runners(Pageable pageable) {
    	
    	Page<Runner> page = runnerRepository.findAll(pageable);
    	
    	return page;
    }
}