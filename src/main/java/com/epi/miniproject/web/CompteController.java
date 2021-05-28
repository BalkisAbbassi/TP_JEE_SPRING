package com.epi.miniproject.web;


import com.epi.miniproject.dao.entity.Client;
import com.epi.miniproject.dao.entity.Compte;
import com.epi.miniproject.dao.repository.ClientRepository;
import com.epi.miniproject.dao.repository.CompteRepository;
import com.epi.miniproject.service.CompteService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.sound.midi.MidiChannel;
import java.util.List;

@RestController
@RequestMapping("/compte")
public class CompteController {
    @Autowired
    private CompteService compteService;


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addCompte(@RequestBody Compte compte){compteService.addCompte(compte);}

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public void updateCompte(@RequestBody Compte compte) {compteService.updateCompte(compte);}

    @DeleteMapping("{id}")
    public void deleteCompte(@PathVariable("id") Long id){compteService.deleteCompte(id);}

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/all")
    public List<Compte> getAllCompte(){
        return compteService.getAll();

    }
    /* public ModelAndView getAllCompte(){
       List<Compte> allCompte = compteService.getAll();
        ModelAndView modelV =new ModelAndView();
        modelV.setViewName("compte-page");
        modelV.addObject("compte",allCompte);
        return  modelV ;
        */


}
