package com.company;

public class Main {

    public static void main(String[] args) {
        Craft work = new Craft("Учитель", "математики");
        Mother objectA = new Mother("Klara", 40, Gender.WOMAN, work);
        System.out.println("Name: " + objectA.getName() + "\nAge: " + objectA.getAge() + "\n"
                + work.getCraft() + " " + work.getMaterial() + "\nПол: " + Gender.WOMAN);
        objectA.canDo("Рисует", " очень хорошо", "10 часов в неделю");


        System.out.println("___________________________________");


        Craft workSun = new Craft("Писатель", "романов");
        Sun objectB = new Sun("Алексей", 18, Gender.MAN, workSun);
        System.out.println("Name: " + objectB.getName() + "\nAge: " + objectB.getAge() + "\n"
                + workSun.getCraft() + " " + workSun.getMaterial() + "\nПол: " + Gender.MAN);
        System.out.print("Хобби: ");
        objectB.canDo("Машины");

        System.out.println("___________________________");


        Craft workSun1 = new Craft("Ученик", "5 класса");
        Sun objectC = new Sun("Артем", 11, Gender.MAN, workSun1);
        System.out.println("Name: " + objectC.getName() + "\nAge: " + objectC.getAge() + "\n"
                + workSun1.getCraft() + " " + workSun1.getMaterial() + "\nПол: " + Gender.MAN);
        objectC.canDo("Танцует ", "хорошо");

    }


}
