package com.example.project.util.mappers;

import com.example.project.DTO.request.worker.WorkerDTO;
import com.example.project.entity.Worker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkerMapper {
    Worker DtoToEntity(WorkerDTO workerDTO);
}
