package com.epi.miniproject.web;

import com.epi.miniproject.dao.entity.Banque;
import com.epi.miniproject.service.BanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/banque")
public class BanqueController {

    @Autowired
    private BanqueService banqueService;

    @PostMapping("/add")
    public void addBanque(@RequestBody Banque banque){banqueService.addBanque(banque);}

    @PutMapping("/update")
    public void updateBanque(@RequestBody Banque banque){banqueService.updateBanque(banque);}

    @DeleteMapping("{id}")
    public void deleteBanque(@PathVariable("id") Long id){banqueService.deleteBanque(id);}

    @GetMapping("/all")
    public ModelAndView getAllBanque(){
        List<Banque> allBanque = banqueService.getAll();
        ModelAndView modelV = new ModelAndView();
        modelV.setViewName("banque-page");
        modelV.addObject("banque",allBanque);
        return modelV;
    }
}
