package com.bits.jpaSpecification.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhoneFilterCriteria {

    private String phoneName;
    private String phoneBrand;
    private LocalDateTime minDateTime;
    private LocalDateTime maxDateTime;
}
