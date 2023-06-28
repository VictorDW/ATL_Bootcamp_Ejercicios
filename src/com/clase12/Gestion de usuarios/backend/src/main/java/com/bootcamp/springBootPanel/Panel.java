package com.bootcamp.springBootPanel;

import com.bootcamp.springBootPanel.controller.UsuarioController;
import com.bootcamp.springBootPanel.entities.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Panel {
    public UsuarioController usuarioController = new UsuarioController();

    @GetMapping("/api/usuarios")
    public List<Usuario> getUsuario() {
        return usuarioController.consultarUsuarios();
    }

    @DeleteMapping ("/api/usuarios/{id}")
    public void delectUsuario(@PathVariable String id) {
        usuarioController.eliminarUsuario(id);
    }

    @PostMapping("/api/usuarios")
    public void postUsuario(@RequestBody Usuario usuario) {
        usuarioController.registrarUsuarios(usuario);
    }

}
