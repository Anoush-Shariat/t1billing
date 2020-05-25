package com.t1billing.cuenta.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime creationTime;
    @JsonIgnore
    private LocalDateTime modificationTime;
}
