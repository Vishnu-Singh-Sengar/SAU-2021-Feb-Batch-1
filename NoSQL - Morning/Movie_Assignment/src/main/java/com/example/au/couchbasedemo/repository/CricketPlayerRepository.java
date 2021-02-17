package com.example.au.couchbasedemo.repository;

import com.example.au.couchbasedemo.model.CricketPlayers;
import org.springframework.data.repository.CrudRepository;

public interface CricketPlayerRepository extends CrudRepository<CricketPlayers, String> {


}
