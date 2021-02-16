package com.example.testweblogic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private Integer id;

    private String name;
    private String title;
    private String salary;
    private String bonusStructure;
    private Integer timeOff;
    private Integer sickTime;
    private String healthPlan;
    private String visionPlan;
    private String dentalPlan;
    private Integer plan;
    private Integer savings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBonusStructure() {
        return bonusStructure;
    }

    public void setBonusStructure(String bonusStructure) {
        this.bonusStructure = bonusStructure;
    }

    public Integer getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(Integer timeOff) {
        this.timeOff = timeOff;
    }

    public Integer getSickTime() {
        return sickTime;
    }

    public void setSickTime(Integer sickTime) {
        this.sickTime = sickTime;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getVisionPlan() {
        return visionPlan;
    }

    public void setVisionPlan(String visionPlan) {
        this.visionPlan = visionPlan;
    }

    public String getDentalPlan() {
        return dentalPlan;
    }

    public void setDentalPlan(String dentalPlan) {
        this.dentalPlan = dentalPlan;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    public Integer getSavings() {
        return savings;
    }

    public void setSavings(Integer savings) {
        this.savings = savings;
    }
}
