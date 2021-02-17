package com.example.testweblogic.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
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

}
