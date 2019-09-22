package com.github.hcsp.generics;

public class Order {
    private final Integer id;
    private final String name;

    public Order(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
