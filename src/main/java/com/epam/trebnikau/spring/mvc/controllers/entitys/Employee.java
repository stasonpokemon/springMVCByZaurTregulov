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
    private String carBrand;
    private String operatingSystem;
    private Map<String, String> operatingSystems;
    private String[] languages;
    private String[] possiblePlacesOfWork;
    private Map<String, String> possiblePlacesOfWorkMap;



    public Employee() {
        englishLevels = new HashMap<>();
        englishLevels.put("A1", "Beginner");
        englishLevels.put("A2", "Pre-Intermediate");
        englishLevels.put("B1", "Intermediate");
        englishLevels.put("B2", "Upper-Intermediate");
        englishLevels.put("C1", "Advance");
        englishLevels.put("C2", "Proficiency");
        operatingSystems = new HashMap<>();
        operatingSystems.put("Mac OS","Mac OS");
        operatingSystems.put("Linux","Linux");
        operatingSystems.put("Windows","Windows");
        possiblePlacesOfWorkMap = new HashMap<>();
        possiblePlacesOfWorkMap.put("At home","At home");
        possiblePlacesOfWorkMap.put("In the office","In the office");
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Map<String, String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(Map<String, String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getPossiblePlacesOfWork() {
        return possiblePlacesOfWork;
    }

    public void setPossiblePlacesOfWork(String[] possiblePlacesOfWork) {
        this.possiblePlacesOfWork = possiblePlacesOfWork;
    }

    public Map<String, String> getPossiblePlacesOfWorkMap() {
        return possiblePlacesOfWorkMap;
    }

    public void setPossiblePlacesOfWorkMap(Map<String, String> possiblePlacesOfWorkMap) {
        this.possiblePlacesOfWorkMap = possiblePlacesOfWorkMap;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", englishLevel='" + englishLevel + '\'' +
                ", car='" + carBrand + '\'' +
                ", operating system='" + operatingSystem + '\'' +
                ", possible places of work='" + possiblePlacesOfWork+ '\'' +
                '}';
    }
}
