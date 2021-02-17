package com.example.testweblogic.controller;

import com.example.testweblogic.entity.Employee;
import com.example.testweblogic.entity.QEmployee;
import com.example.testweblogic.repository.EmployeeRepo;
import com.example.testweblogic.searchCriteria.SearchCriteria;
import com.querydsl.core.BooleanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@RestController
@RequestMapping("/employee")
public class TestController {

    private final EmployeeRepo employeeRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public TestController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @RequestMapping("/all")
    public List<Employee> getAllEmployees() {
        return StreamSupport.stream(employeeRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @RequestMapping("/search")
    public List<Employee> search(@RequestBody SearchCriteria sc) {
        QEmployee employee = QEmployee.employee;

        BooleanBuilder where = new BooleanBuilder();
        if (sc.getId() != null)
            where.and(employee.id.eq(sc.getId()));
        if (sc.getName() != null)
            where.and(employee.name.like("%" + sc.getName() + "%"));
        if (sc.getSickTime() != null)
            where.and(employee.sickTime.eq(sc.getSickTime()));
        if (sc.getSickTimeStart() != null)
            where.and(employee.sickTime.goe(sc.getSickTimeStart()));
        if (sc.getSickTimeEnd() != null)
            where.and(employee.sickTime.loe(sc.getSickTimeEnd()));
        if (sc.getTitle() != null)
            where.and(employee.title.like("%" + sc.getTitle() + "%"));
        if (sc.getSalary() != null)
            where.and(employee.salary.like("%" + sc.getSalary() + "%"));
        if (sc.getBonusStructure() != null)
            where.and(employee.bonusStructure.like("%" + sc.getBonusStructure() + "%"));
        if (sc.getHealthPlan() != null)
            where.and(employee.healthPlan.like("%" + sc.getHealthPlan() + "%"));
        if (sc.getVisionPlan() != null)
            where.and(employee.visionPlan.like("%" + sc.getVisionPlan() + "%"));
        if (sc.getDentalPlan() != null)
            where.and(employee.dentalPlan.like("%" + sc.getDentalPlan() + "%"));
        if (sc.getTimeOff() != null)
            where.and(employee.timeOff.eq(sc.getTimeOff()));
        if (sc.getTimeOffStart() != null)
            where.and(employee.timeOff.goe(sc.getTimeOffStart()));
        if (sc.getTimeOffEnd() != null)
            where.and(employee.timeOff.loe(sc.getTimeOffEnd()));
        if (sc.getPlan() != null)
            where.and(employee.plan.eq(sc.getPlan()));
        if (sc.getPlanStart() != null)
            where.and(employee.plan.goe(sc.getPlanStart()));
        if (sc.getPlanEnd() != null)
            where.and(employee.plan.loe(sc.getPlanEnd()));
        if (sc.getSavings() != null)
            where.and(employee.savings.eq(sc.getSavings()));
        if (sc.getSavingsStart() != null)
            where.and(employee.savings.goe(sc.getSavingsStart()));
        if (sc.getSavingsEnd() != null)
            where.and(employee.savings.loe(sc.getSavingsEnd()));

        return StreamSupport.stream(employeeRepo.findAll(where).spliterator(), false)
                .collect(Collectors.toList());
    }
}
