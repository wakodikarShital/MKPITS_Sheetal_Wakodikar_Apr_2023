package com.example.springBootAdvanceMapping.service;

import com.example.springBootAdvanceMapping.entity.Address;
import com.example.springBootAdvanceMapping.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address findById(Integer add_id) {
       return addressRepository.findById(add_id).get();
    }
}
