package com.codingdojo.trevor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.trevor.models.Dojo;
import com.codingdojo.trevor.models.Ninja;
import com.codingdojo.trevor.repositories.DojoRepository;
import com.codingdojo.trevor.repositories.NinjaRepository;

@Service
public class DojoNinjaService {
	
	@Autowired
	private DojoRepository drepo;
	
	@Autowired 
	private NinjaRepository nrepo;
	
    // returns all dojos
    public List<Dojo> allDojos() {
        return drepo.findAll();
    }
    // creates a dojo
    public Dojo createDojo(Dojo dojo) {
        return drepo.save(dojo);
    }
    // grabs a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> result = drepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    // returns all Ninjas
    public List<Ninja> allNinjas() {
        return nrepo.findAll();
    }
    // creates a Ninja
    public Ninja createNinja(Ninja ninja) {
        return nrepo.save(ninja);
    }
    // grabs a Ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> result = nrepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

}
