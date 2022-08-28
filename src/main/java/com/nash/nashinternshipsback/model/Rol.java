package com.nash.nashinternshipsback.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document
@NoArgsConstructor
public class Rol {
    @Id
    private String id;

    private String rol;




}