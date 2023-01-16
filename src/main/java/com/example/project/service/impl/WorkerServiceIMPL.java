package com.example.project.service.impl;

import com.example.project.DTO.request.worker.WorkerDTO;
import com.example.project.entity.Worker;
import com.example.project.repo.WorkerRepo;
import com.example.project.service.WorkerService;
import com.example.project.util.mappers.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceIMPL implements WorkerService {
    @Autowired
    private WorkerRepo workerRepo;
    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public String registerWorker(WorkerDTO workerDTO) {

        Worker worker=new Worker(
                workerDTO.getWorkerId(),
                workerDTO.getFirst_name(),
                workerDTO.getLast_name(),
                workerDTO.getEmail(),
                workerDTO.getCity(),
                workerDTO.getContact(),
                workerDTO.getCategory(),
                workerDTO.getPassword(),
                workerDTO.getCertifications(),
                workerDTO.getAddress(),
                workerDTO.getDescription()
        );
        workerRepo.save(worker);
        return worker.getFirst_name()+ " "+worker.getLast_name() +" is registered..!";
    }
}
//if (!customerRepo.existsById(customer.getCustomerId())) {
//            customerRepo.save(customer);
//            return customer.getCustomerName() + " saved";
//        } else {
//            System.out.println("Customer id already exists");
//            return "Customer id already exists";
//        }
//    }