package com.example.testweblogic.searchCriteria;

import lombok.Data;

@Data
public class SearchCriteria {
    private Integer id;
    private String name;
    private String title;
    private String salary;
    private String bonusStructure;
    private Integer timeOff;
    private Integer timeOffStart;
    private Integer timeOffEnd;
    private Integer sickTime;
    private Integer sickTimeStart;
    private Integer sickTimeEnd;
    private String healthPlan;
    private String visionPlan;
    private String dentalPlan;
    private Integer plan;
    private Integer planStart;
    private Integer planEnd;
    private Integer savings;
    private Integer savingsStart;
    private Integer savingsEnd;
}
