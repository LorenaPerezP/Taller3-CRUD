package co.edu.konrad.crudusuarios.controller;

import co.edu.konrad.crudusuarios.model.Persona;
import co.edu.konrad.crudusuarios.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonaController {
    @Autowired
    private PersonaServiceAPI personaServiceAPI;
    
    @RequestMapping("/persona/")
    public String index(Model model){
        model.addAttribute("list", personaServiceAPI.getAll());
        return "indexPersonas";
    }

    @GetMapping("persona/save/{id}")
    public String viewSave(@PathVariable("id") Long id, Model model){
        if (id != null && id != 0){
            model.addAttribute("persona", personaServiceAPI.get(id));
        }else{
            model.addAttribute("persona", new Persona());
        }
        return "savePersona"; 
    }

    @PostMapping("/persona/save")
    public String save(Persona persona){
        personaServiceAPI.save(persona);
        return "redirect:/";
    }

    @GetMapping("/persona/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        personaServiceAPI.delete(id);
        return "redirect:/";
    }
}
