package com.qa.project.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.project.persistence.domain.BuyerDomain;

@Repository
public interface BuyerRepo extends JpaRepository<BuyerDomain, Long>  {

}
