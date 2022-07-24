package com.testcompany;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("May"); //{8}
        System.out.println(cat.shout()); //{9}
    }
}


class Cat {  //{1}
    private String name; //{2}

    public Cat(String name) { //{3}
        this.name = name; //{4}
    }

    public String shout() { //{5}
        return "My name is "+name+". meow~"; //{6}
    }
}
