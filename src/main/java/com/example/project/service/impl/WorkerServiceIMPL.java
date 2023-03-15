package com.example.project.service.impl;

import com.example.project.DTO.request.worker.WorkerSaveDTO;
import com.example.project.DTO.response.worker.WorkerProfileDTO;
import com.example.project.entity.Worker;
import com.example.project.repo.WorkerRepo;
import com.example.project.service.WorkerService;

import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceIMPL implements WorkerService {
    @Autowired
    private WorkerRepo workerRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String registerWorker(WorkerSaveDTO workerSaveDTO) {

        Worker worker=new Worker(
                workerSaveDTO.getFirst_name(),
                workerSaveDTO.getLast_name(),
                workerSaveDTO.getPhoto(),
                workerSaveDTO.getEmail(),
                workerSaveDTO.getCity(),
                workerSaveDTO.getContact(),
                workerSaveDTO.getCategory(),
                workerSaveDTO.getPassword(),
                workerSaveDTO.getCertifications(),
                workerSaveDTO.getAddress(),
                workerSaveDTO.getDescription()
        );
        workerRepo.save(worker);
        return worker.getFirst_name()+ " "+worker.getLast_name() +" is registered..!";
    }

    @Override
    public List<WorkerProfileDTO> getByCategory(String category) throws NotFoundException {
        List<Worker> workers=workerRepo.findAllByCategoryEquals(category);

        if(workers.size()!=0){
            List<WorkerProfileDTO> workerProfilesDTO=modelMapper.map(workers,new TypeToken<List<WorkerProfileDTO>>(){}.getType());
            return workerProfilesDTO;
        }else{
            throw new NotFoundException("No results");
        }

    }

    @Override
    public List<WorkerProfileDTO> getByCity(String city) throws NotFoundException {
        List<Worker> workers=workerRepo.findAllByCityEquals(city);

        if(workers.size()!=0){
            List<WorkerProfileDTO> workerProfilesDTO=modelMapper.map(workers,new TypeToken<List<WorkerProfileDTO>>(){}.getType());
            return workerProfilesDTO;
        }else{
            throw new NotFoundException("No results");
        }

    }
}

