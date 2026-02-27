package com.model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Donor;

@Repository
public interface DonorRepo extends JpaRepository<Donor,Long> {

}
