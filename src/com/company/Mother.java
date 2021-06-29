package com.company;

public class Mother extends GrandFather {
    public Mother(String name, int age, Gender gender, Craft craft) {
        super(name,age,gender,craft);
    }

    public void canDo(String doing){
        System.out.println(doing);
    }
    public void canDo(String doing, String doingLevel){
        System.out.println(doing + doingLevel);
    }
     public final void canDo(String doing, String doingLevel, String howOften){
        System.out.println(doing + doingLevel + ", посвящает этому " + howOften);
    }

}
