package com.nash.nashinternshipsback.repository;



import com.nash.nashinternshipsback.Utils.Roles;
import com.nash.nashinternshipsback.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends MongoRepository<Rol, Integer> {

    Optional<Rol> findByRol(Roles roles);

    boolean existsByRol(String rolNombre);
}
