package com.company;

public class Cat {

    String name;
    char gender;
    String color;
    int age;
    float weight;

    public Cat(String catName){

       name=catName;

    }

    public Cat(String catName,int catAge, char catGender){
        name=catName;
        age=catAge;
        gender=catGender;

    }

    public Cat(){
        
    }

    public void mew() {
        System.out.println(name + " is mewing");
    }

    public void walk(int numberOfSteps) {
        for (int i = 1; i <= numberOfSteps; i++) {
            System.out.println(name + " is walking. Step is " + i);
        }
    }
}
