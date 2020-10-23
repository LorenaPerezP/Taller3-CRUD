package co.edu.konrad.crudusuarios.controller;

import co.edu.konrad.crudusuarios.model.Deporte;
import co.edu.konrad.crudusuarios.service.api.DeporteServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeporteController {
    @Autowired
    private DeporteServiceAPI deporteServiceAPI;
    
    @RequestMapping("/deporte/")
    public String index(Model model){
        model.addAttribute("list", deporteServiceAPI.getAll());
        return "indexDeportes";
    }

    @GetMapping("/deporte/save/{id}")
    public String viewSave(@PathVariable("id") Long id, Model model){
        if (id != null && id != 0){
            model.addAttribute("deporte", deporteServiceAPI.get(id));
        }else{
            model.addAttribute("deporte", new Deporte());
        }
        return "saveDeporte"; 
    }

    @PostMapping("/deporte/save")
    public String save(Deporte deporte){
        deporteServiceAPI.save(deporte);
        return "redirect:/";
    }

    @GetMapping("/deporte/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        deporteServiceAPI.delete(id);
        return "redirect:/";
    }

    /**
     * @return DeporteServiceAPI return the deporteServiceAPI
     */
    public DeporteServiceAPI getDeporteServiceAPI() {
        return deporteServiceAPI;
    }

    /**
     * @param deporteServiceAPI the deporteServiceAPI to set
     */
    public void setDeporteServiceAPI(DeporteServiceAPI deporteServiceAPI) {
        this.deporteServiceAPI = deporteServiceAPI;
    }

}
