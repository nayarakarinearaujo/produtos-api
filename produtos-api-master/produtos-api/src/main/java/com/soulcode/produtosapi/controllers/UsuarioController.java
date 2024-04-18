package com.soulcode.produtosapi.controllers;

import com.soulcode.produtosapi.models.Usuario;
import com.soulcode.produtosapi.respositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public Usuario save() {
        Usuario u = new Usuario();
        u.setNome("Nayara");
        u.setEmail("nayarakarine.araujo@gmail.com");
        u.setIdade(30);
        return usuariosRepository.save(u);

    }
}

