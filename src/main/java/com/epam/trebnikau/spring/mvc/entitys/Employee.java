package com.epam.trebnikau.spring.mvc.entitys;

import com.epam.trebnikau.spring.mvc.validation.CheckEmailAnnotation;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Name must be more than 2 characters")
    @NotBlank(message = "name is required field")
    private String name;
    @Size(min = 2, message = "Surname must be more than 2 characters")
    @NotEmpty(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "salary must be greater than 499")
    @Max(value = 25000, message = "salary must be less than 25001")
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
    @Pattern(regexp = "\\d{2}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XX-XXX-XX-XX")
    private String phoneNumber;
    @CheckEmailAnnotation(value = "epam.com", message = "email must ends with epam.com")
    private String email;



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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", phone number='" + phoneNumber+ '\'' +
                ", email='" + email+ '\'' +
                '}';
    }
}
