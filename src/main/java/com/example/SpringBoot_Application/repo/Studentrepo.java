package com.example.SpringBoot_Application.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_Application.entity.Students;

@Repository
public interface Studentrepo extends JpaRepository<Students,Integer> {
	

}
