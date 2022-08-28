package com.nash.nashinternshipsback.service.Autentificacion;

import com.nash.nashinternshipsback.model.Usuario;
import com.nash.nashinternshipsback.security.SecurityUser;
import com.nash.nashinternshipsback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceAuth implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return SecurityUser.build(usuario);
    }
}
