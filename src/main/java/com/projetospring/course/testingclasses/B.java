package com.projetospring.course.testingclasses;

import com.projetospring.course.testingclasses.A;

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
