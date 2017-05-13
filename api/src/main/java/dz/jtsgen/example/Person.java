package dz.jtsgen.example;

import dz.jtsgen.annotations.TypeScript;

import java.time.LocalDate;

@TypeScript
public class Person {

    private String name;
    private LocalDate birthdate;
    private Sex sex;

    public Person(String name, LocalDate birthdate, Sex sex) {
        this.name = name;
        this.birthdate = birthdate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
