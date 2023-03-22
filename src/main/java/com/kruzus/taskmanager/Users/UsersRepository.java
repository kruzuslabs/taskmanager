package com.kruzus.taskmanager.Users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

}
