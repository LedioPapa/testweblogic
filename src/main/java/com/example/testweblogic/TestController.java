package com.example.testweblogic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TestController {

    private final EmployeeRepo employeeRepo;

    public TestController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @RequestMapping("/h")
    public List<Employee> test(@RequestParam(value = "id", required = false) Integer id) {
        if (id != null)
            return Collections.singletonList(employeeRepo.findById(id).orElse(new Employee()));
        else
            return employeeRepo.findAll();
    }
}
