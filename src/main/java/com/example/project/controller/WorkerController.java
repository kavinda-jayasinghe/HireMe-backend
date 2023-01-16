package com.example.project.controller;


import com.example.project.DTO.request.worker.WorkerDTO;
import com.example.project.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="http://localhost:3000/")
@RequestMapping("api/v1/worker")
public class WorkerController {

    @Autowired
private WorkerService workerService;

    @PostMapping(path="/register")
    public String register(@RequestBody WorkerDTO workerDTO){
        String name= workerService.registerWorker(workerDTO);
        return name;

    }

}
