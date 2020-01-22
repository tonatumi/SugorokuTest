package com.tonatonahouse.sugorokutest;


import org.bukkit.entity.EntityType;

public class Piece {
    String name;
    EntityType etype = EntityType.VILLAGER;

    public void setName(String name) {
        this.name = name;
    }

    public void setEtype(EntityType etype) {
        this.etype = etype;
    }
}
