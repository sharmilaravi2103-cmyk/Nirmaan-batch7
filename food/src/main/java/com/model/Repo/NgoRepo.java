package com.model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Ngo;
@Repository

public interface NgoRepo extends JpaRepository<Ngo,Long> {


}
