package com.bits.jpaSpecification.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public List<Phone> filterPhones(PhoneFilterCriteria filter, Pageable pageable) {
        Specification<Phone> spec = PhoneSpecification.filterPhone(filter);
        Page<Phone> page = phoneRepository.findAll(spec, pageable);
        return page.getContent();
    }
}
