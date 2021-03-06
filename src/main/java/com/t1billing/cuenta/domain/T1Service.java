package com.t1billing.cuenta.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="service")
public class T1Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String description;
    private String serviceCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal cost;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;

}