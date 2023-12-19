package com.example.springBootAdvanceMapping.repository;

import com.example.springBootAdvanceMapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
