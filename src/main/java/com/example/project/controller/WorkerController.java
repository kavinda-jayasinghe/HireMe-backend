package com.example.project.controller;


import com.example.project.DTO.request.worker.WorkerSaveDTO;
import com.example.project.DTO.response.worker.WorkerProfileDTO;
import com.example.project.service.WorkerService;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:3000/")
@RequestMapping("api/v1/worker")
public class WorkerController {

    @Autowired
private WorkerService workerService;

    @GetMapping(path="/getAllWorkers")
    public List<WorkerProfileDTO> getAllWorkers(){
        List<WorkerProfileDTO> customerDTOList=workerService.getAllWorkers();
        return customerDTOList;
    }


    @PostMapping(path="/register")
    public String register(@RequestBody WorkerSaveDTO workerSaveDTO){
        String name= workerService.registerWorker(workerSaveDTO);
        return name;

    }

    @GetMapping(path={"/search-worker-by-category"},
            params={"category"}
    )
    public List<WorkerProfileDTO> getWorkerByCategory(@RequestParam(value = "category")String category) throws NotFoundException {
        List<WorkerProfileDTO>getWorkers=workerService.getByCategory(category);
        return getWorkers;
    }

    @GetMapping(path={"/search-worker-by-city"},
            params={"city"}
    )
    public List<WorkerProfileDTO> getWorkerByCity(@RequestParam(value = "city")String city) throws NotFoundException {
        List<WorkerProfileDTO>getWorkers=workerService.getByCity(city);
        return getWorkers;
    }

}
