package com.example.project.service;

import com.example.project.DTO.request.worker.WorkerSaveDTO;
import com.example.project.DTO.response.worker.WorkerProfileDTO;
import javassist.NotFoundException;

import java.util.List;

public interface WorkerService {
    String registerWorker(WorkerSaveDTO workerSaveDTO);

    List<WorkerProfileDTO> getByCategory(String category) throws NotFoundException;

    List<WorkerProfileDTO> getByCity(String city) throws NotFoundException;

    List<WorkerProfileDTO> getAllWorkers();
}
