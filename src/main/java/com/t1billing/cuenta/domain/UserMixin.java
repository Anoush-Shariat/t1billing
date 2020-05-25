package com.t1billing.cuenta.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

public abstract class UserMixin {
    @JsonCreator
    public UserMixin( String firstName,
                     String lastName,
                     String email) {

    }

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();


        objectMapper.setVisibilityChecker(objectMapper.getSerializationConfig()
                .getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));

        objectMapper.addMixIn(User.class, UserMixin.class);
        User newUder = User.builder()
                .firstName("Anoush")
                .lastName("Shariat")
                .email("anoush.shariat@gmail.com")
                .creationTime(LocalDateTime.now())
                .modificationTime(LocalDateTime.now())
                .build();

        String newUserStr = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newUder);
        System.out.println(newUserStr);

    }
}
