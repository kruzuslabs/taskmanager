package com.kruzus.taskmanager.Tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository<TasksEntity, Long> {

}
