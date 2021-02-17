package com.example.au.couchbasedemo.model;

import com.sun.istack.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document
public class CricketPlayers {
    @Id
    String id;

    @NotNull
    @Field
    String name;
    @NotNull
    @Field
    int runs;
    @NotNull
    @Field
    float avg;
    @NotNull
    @Field
    int wickets;

    public CricketPlayers(String id, String name, int runs, float avg, int wickets) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.avg = avg;
        this.wickets = wickets;
    }

    public CricketPlayers() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}
