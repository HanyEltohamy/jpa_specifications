package com.bits.jpaSpecification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.bits.jpaSpecification.model.Phone;
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> ,JpaSpecificationExecutor<Phone>{

}
