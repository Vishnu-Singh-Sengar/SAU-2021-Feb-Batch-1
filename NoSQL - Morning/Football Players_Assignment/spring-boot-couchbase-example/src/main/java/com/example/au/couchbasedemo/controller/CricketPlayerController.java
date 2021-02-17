package com.example.au.couchbasedemo.controller;

import com.example.au.couchbasedemo.model.CricketPlayers;
import com.example.au.couchbasedemo.model.Employees;
import com.example.au.couchbasedemo.repository.CricketPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CricketPlayerController {
    
    @Autowired
    CricketPlayerRepository cricketPlayerRepository;

    
    @PostMapping("/CricketPlayers")
    public CricketPlayers addCricketPlayerPost(@RequestBody CricketPlayers newCricketPlayer) {
        return cricketPlayerRepository.save(newCricketPlayer);
    }
    
    @GetMapping("/CricketPlayers/{id}")
    public Optional<CricketPlayers> getCricketPlayer(@PathVariable String id) {
        if (cricketPlayerRepository.existsById(id)) {
            return cricketPlayerRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/CricketPlayers/runsCreaterThan/{runs}")
    public List<CricketPlayers> getCricketPlayerByRuns(@PathVariable int runs) {
        List<CricketPlayers> cricketPlayersList=new ArrayList<>();
        cricketPlayerRepository.findAll().forEach(CricketPlayer->{
            if(CricketPlayer.getRuns()>runs)
            {
                cricketPlayersList.add(CricketPlayer);
            }
        });
        return cricketPlayersList;
    }

    

    @DeleteMapping("/CricketPlayers/{id}")
    public void deleteById(@PathVariable String id) {
        cricketPlayerRepository.deleteById(id);
    }
    

}