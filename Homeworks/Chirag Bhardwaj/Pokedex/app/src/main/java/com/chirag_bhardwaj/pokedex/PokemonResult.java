package com.chirag_bhardwaj.pokedex;

import java.io.Serializable;
import java.util.ArrayList;

public class PokemonResult implements Serializable {
    String name, detail;
    ArrayList<Abilities> abilities = new ArrayList<>();
    ArrayList<Stats> stats = new ArrayList<>();
    Sprites sprites;
    Integer weight, height, id, order, base_experience;

    public PokemonResult(String name, String detail, ArrayList<Abilities> abilities,
                         ArrayList<Stats> stats,
                         Sprites sprites, Integer weight,
                         Integer height, Integer id, Integer order, Integer base_experience) {
        this.name = name;
        this.detail = detail;
        this.abilities = abilities;
        this.stats = stats;
        this.sprites = sprites;
        this.weight = weight;
        this.height = height;
        this.id = id;
        this.order = order;
        this.base_experience = base_experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ArrayList<Abilities> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Abilities> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Stats> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stats> stats) {
        this.stats = stats;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }
}