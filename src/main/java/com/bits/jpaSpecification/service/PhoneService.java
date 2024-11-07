package com.bits.jpaSpecification.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.bits.jpaSpecification.model.Phone;
import com.bits.jpaSpecification.model.PhoneFilterCriteria;
import com.bits.jpaSpecification.model.PhoneSpecification;
import com.bits.jpaSpecification.repository.PhoneRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> findAllPhones(PhoneFilterCriteria PhoneFilterCriteria) {
        Specification<Phone> specification = PhoneSpecification.filterPhone(PhoneFilterCriteria);
        return phoneRepository.findAll(specification);
    }
}
