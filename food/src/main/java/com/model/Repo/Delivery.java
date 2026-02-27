package com.model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Delivery extends JpaRepository<Delivery, Long> {

}
