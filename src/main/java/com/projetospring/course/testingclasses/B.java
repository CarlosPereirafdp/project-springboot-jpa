package com.projetospring.course;

public class B extends A {

    private String name;

    @Override
    public String getName() {
        return name + "LOL";
    }

    public void setName(String name) {
        this.name = name;
    }
}
