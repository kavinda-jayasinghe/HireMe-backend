package com.example.project.util.mappers;

import com.example.project.DTO.response.worker.WorkerProfileDTO;
import com.example.project.entity.Worker;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface WorkerMapper {
    List<WorkerProfileDTO> entityListToDtoList(List<Worker> customer);
}
