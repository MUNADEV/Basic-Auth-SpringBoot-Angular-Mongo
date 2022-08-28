package com.nash.nashinternshipsback.service;


import com.nash.nashinternshipsback.model.Rol;
import com.nash.nashinternshipsback.Utils.Roles;
import com.nash.nashinternshipsback.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(Roles roles){
        return rolRepository.findByRol(roles);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}