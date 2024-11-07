package com.bits.jpaSpecification.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;

public class PhoneSpecification {

    public static Specification<Phone> filterPhone(PhoneFilterCriteria filter) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (filter.getMinDateTime() != null) {
                predicates.add(
                        criteriaBuilder.greaterThanOrEqualTo(root.get("purchaseDateTime"), filter.getMinDateTime()));
            }
            if (filter.getMaxDateTime() != null) {
                predicates
                        .add(criteriaBuilder.lessThanOrEqualTo(root.get("purchaseDateTime"), filter.getMaxDateTime()));
            }
            if (filter.getPhoneName() != null && !filter.getPhoneName().isBlank()) {
                predicates.add(criteriaBuilder.equal(root.get("phoneName"), filter.getPhoneName()));
            }

            if (filter.getPhoneBrand() != null && !filter.getPhoneBrand().isBlank()) {
                predicates.add(criteriaBuilder.equal(root.get("phoneBrand"), filter.getPhoneBrand()));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
