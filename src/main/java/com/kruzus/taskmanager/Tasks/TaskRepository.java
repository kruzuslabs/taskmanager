package com.kruzus.taskmanager.Tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TasksEntity, Long> {


    // @Query(value = "SELECT t FROM TasksEntity  t ORDER BY t.id DESC")
    // List<TasksEntity> findOrderDescByID();
}
