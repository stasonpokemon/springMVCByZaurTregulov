package com.epam.trebnikau.spring.mvc.controllers.entitys;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private String englishLevel;
    private Map<String, String> englishLevels;

    public Employee() {
        englishLevels = new HashMap<>();
            englishLevels.put("A1", "Beginner");
            englishLevels.put("A2", "Pre-Intermediate");
            englishLevels.put("B1", "Intermediate");
            englishLevels.put("B2", "Upper-Intermediate");
            englishLevels.put("C1", "Advance");
            englishLevels.put("C2", "Proficiency");

    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getEnglishLevels() {
        return englishLevels;
    }

    public void setEnglishLevels(Map<String, String> englishLevels) {
        this.englishLevels = englishLevels;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", englishLevel='" + englishLevel + '\'' +
                '}';
    }
}
