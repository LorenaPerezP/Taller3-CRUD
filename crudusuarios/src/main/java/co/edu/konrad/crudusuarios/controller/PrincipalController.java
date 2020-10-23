package co.edu.konrad.crudusuarios.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class PrincipalController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
