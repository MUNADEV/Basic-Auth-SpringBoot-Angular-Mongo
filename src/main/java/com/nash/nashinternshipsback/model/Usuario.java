package com.nash.nashinternshipsback.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@Document
public class Usuario {
    @Id
    private String id;
    @NotNull
    private String nombre;
    @NotNull
    private String nombreUsuario;
    @NotNull
    private String email;
    @NotNull
    private String password;

    @NotNull
    @DBRef(lazy = true)
    @JsonIgnore
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {}

    public Usuario(@NotNull String nombre, @NotNull String nombreUsuario, @NotNull String email, @NotNull String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

}
