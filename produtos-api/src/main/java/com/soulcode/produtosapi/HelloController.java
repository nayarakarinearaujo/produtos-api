package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/elastech")
    @ResponseBody
    public String paginaelastech(){
        return "Olá eu sou a página ElasTech";
    }

    @GetMapping("/soulcode")
    @ResponseBody
    public String paginasoulcode(){
        return "Soul Code pagina teste";
    }

    @GetMapping("/cadastro-produto")
    public String cadastroproduto(){
        return "cadastro";
    }

    @GetMapping("/cadastro-usuario")
    public String cadastrousuario(){
        return "cadastro-usuario";
    }


}
