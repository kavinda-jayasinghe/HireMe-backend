package com.example.project.repo;

import com.example.project.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
@EnableJpaRepositories
public interface WorkerRepo extends JpaRepository<Worker,Integer> {

    List<Worker> findAllByCategoryEquals(String category);

    List<Worker> findAllByCityEquals(String city);
}
