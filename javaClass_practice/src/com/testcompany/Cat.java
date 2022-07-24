package com.testcompany;

public class Cat {

    private String name; //{2}

    public Cat(String name_out) { //{3}
        this.name = name_out; //{4}
    }

    public String shout() { //{5}
        return "My name is "+name+". meow~"; //{6}
    }
}
