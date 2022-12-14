package com.example.abouelhijafatma.Repositories;

import com.example.abouelhijafatma.Entities.Project;
import com.example.abouelhijafatma.Entities.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository  extends JpaRepository<Sprint,Integer> {
}
