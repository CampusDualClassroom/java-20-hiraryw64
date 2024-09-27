package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> gente = new ArrayList<>();
        gente.add(new Person("John", "Smith"));
        gente.add(new Teacher("María", "Montessori", "Educación"));
        gente.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        gente.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        return gente;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person p : stringList){
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
