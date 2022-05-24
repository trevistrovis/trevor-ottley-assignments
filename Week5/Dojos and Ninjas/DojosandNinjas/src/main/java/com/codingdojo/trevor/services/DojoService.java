package com.codingdojo.trevor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.trevor.models.Dojo;
import com.codingdojo.trevor.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository repo;
    
    public DojoService(DojoRepository repo) {
        this.repo = repo;
    }
    // returns all dojos
    public List<Dojo> all() {
        return repo.findAll();
    }
    // creates a dojo
    public Dojo create(Dojo dojo) {
    	System.out.println(dojo.getId());
        return repo.save(dojo);
    }
    // grabs a dojo
    public Dojo find(Long id) {
        Optional<Dojo> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

}
