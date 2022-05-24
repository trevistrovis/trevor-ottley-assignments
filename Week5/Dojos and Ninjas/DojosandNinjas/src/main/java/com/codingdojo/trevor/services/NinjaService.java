package com.codingdojo.trevor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.trevor.models.Ninja;
import com.codingdojo.trevor.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository repo;
    
    public NinjaService(NinjaRepository repo) {
        this.repo = repo;
    }
    // returns all Ninjas
    public List<Ninja> all() {
        return repo.findAll();
    }
    // creates a Ninja
    public Ninja create(Ninja ninja) {
    	System.out.println(ninja.getId());
        return repo.save(ninja);
    }
    // grabs a Ninja
    public Ninja find(Long id) {
        Optional<Ninja> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

}
