package com.model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.D_agent;

@Repository

public interface D_agentRepo extends JpaRepository<D_agent, Long> {

}
