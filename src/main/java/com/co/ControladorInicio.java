
package com.co;

import com.co.DAO.ClienteDAO;
import com.co.pojo.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicio {
    
    @Autowired
    private ClienteDAO clienteDao;
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    } 
    
    @GetMapping("/login")
    public String login(){
        return "login";
    } 
    
    @GetMapping("/registro")
    public String registro(){
        return "registro";
    }
    
    @GetMapping("/guatape")
    public String guatape(){
        return "peñol-guatape";
    }
    
    @GetMapping("/catedral")
    public String catedral(){
        return "catedral-sal";
    }
    
    @GetMapping ("/tota")
    public String tota(){
        return "laguna-tota";
    }
    
    @GetMapping ("/tatacoa")
    public String tatacoa(){
        return "tatacoa";
    }
    
    @GetMapping ("/cocuy")
    public String cocuy(){
        return "cocuy";
    }
    
    @GetMapping ("/mavecure")
    public String mavecure(){
        return "mavecure";
    }
    
    @GetMapping ("/victoria")
    public String victoria(){
        return "Victoria-Regia";
    }
   
    @GetMapping("/Chiribiquete")
    public String Chiribiquete(){
        return "Chiribiquete";
    }
    
    @GetMapping ("/solano")
    public String solano(){
        return "bahia-solano";
    }
    
    @GetMapping ("/nuqui")
    public String nuqui(){
        return "nuqui";
    }
    
    @GetMapping ("/lagunaver")
    public String lagunaver(){
        return "laguna-verde";
    }
    
    @GetMapping ("/tayrona")
    public String tayrona(){
        return "tayrona";
    }
    
    @GetMapping ("/palomino")
    public String palomino(){
        return "Palomino";
    }
    
    @GetMapping ("/rosario")
    public String rosario(){
        return "Isla-Rosario";
    }
    
    @GetMapping ("/cristales")
    public String cristales(){
        return "cristales";
    }
    
    @GetMapping ("/tuparro")
    public String tuparro(){
        return "Tuparro";
    }
    
    @GetMapping ("/tinije")
    public String tinije(){
        return "Tinije";
    }
    
    @GetMapping ("/andres")
    public String andres(){
        return "san-andres";
    }
    
    @GetMapping ("/gorgona")
    public String gorgona(){
        return "gorgona";
    }
    
    @GetMapping ("/malpelo")
    public String malpelo(){
        return "malpelo";
    }
    
    @GetMapping("/loginadmin")
    public String loginadmin(Model model){
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes",clientes);
        return "loginadmin";
    }
    
    @PostMapping ("/guardar")
    public String guardar(@ModelAttribute cliente clientes){
        clienteDao.save(clientes);
        return "redirect:/loginadmin";
    }
    
    @GetMapping ("/editar/{idcliente}")
    public String editar(@PathVariable ("idcliente") Integer idcliente, Model model){
        var clientes = clienteDao.findById(idcliente);
        model.addAttribute("clientes",clientes);
        model.addAttribute("editMode","true");
        return "modificar";
    }
    
    @GetMapping ("/eliminar/{idcliente}")
    public String eliminar (@PathVariable ("idcliente") Integer idcliente){
        clienteDao.deleteById(idcliente);
        return "redirect:/loginadmin";
    }
  
}
