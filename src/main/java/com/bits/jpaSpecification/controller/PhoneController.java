package com.bits.jpaSpecification.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.jpaSpecification.model.Phone;
import com.bits.jpaSpecification.model.PhoneFilterCriteria;
import com.bits.jpaSpecification.service.PhoneService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/phones")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping
    public ResponseEntity<List<Phone>> getPhones(PhoneFilterCriteria filter) {
        return ResponseEntity.ok(phoneService.findAllPhones(filter));
    }
}
