package com.mycompany.web;


import com.mycompany.dao.PersonaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
Se da la instruccion de inciar el index ejecutando el atributo personas
*/
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired

    private PersonaDao personaDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var personas=personaDao.findAll();
        
        log.info("ejecutando el controlador Spring MVC.");
        model.addAttribute("personas", personas);
        return "index";
    }
}
