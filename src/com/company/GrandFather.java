package com.company;

public class GrandFather {
    private String name;
    private int age;
    private Gender gender;
    private Craft craft;

    public GrandFather(String name, int age, Gender gender, Craft craft) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.craft = craft;
    }

    public Craft getColorEyes() {
        return craft;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
