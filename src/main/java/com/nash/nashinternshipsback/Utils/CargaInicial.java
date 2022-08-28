package com.nash.nashinternshipsback.Utils;

import com.nash.nashinternshipsback.model.Rol;
import com.nash.nashinternshipsback.repository.RolRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.logging.Logger;

@Configuration
public class CargaInicial {

    private final static Logger LOGGER = Logger.getLogger(CargaInicial.class.getName());

    @Bean
    public CommandLineRunner cargarRoles(RolRepository rolRepository) {
    return (args -> {
            if(!rolRepository.existsByRol(Roles.ROL_ADMIN.name()) && !rolRepository.existsByRol(Roles.ROL_USER.name())) {

                Rol rolAdmin = new Rol();
                Rol rolUser = new Rol();

                rolAdmin.setRol(Roles.ROL_ADMIN.name());
                rolUser.setRol(Roles.ROL_USER.name());

                rolRepository.save(rolAdmin);
                rolRepository.save(rolUser);
            }
        });
    }
}
