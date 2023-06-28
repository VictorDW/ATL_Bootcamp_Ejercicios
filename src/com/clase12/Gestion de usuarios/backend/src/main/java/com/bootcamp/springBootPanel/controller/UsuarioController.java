package com.bootcamp.springBootPanel.controller;

import com.bootcamp.springBootPanel.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private static  final List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> consultarUsuarios() {
        return usuarios;
    }

    public void registrarUsuarios(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(String id) {

        for ( Usuario usuario : usuarios) {

            if(id.equals(usuario.getId()))
                usuarios.remove(usuario);
        }
    }
}
