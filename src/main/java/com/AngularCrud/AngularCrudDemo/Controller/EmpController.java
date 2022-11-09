package com.AngularCrud.AngularCrudDemo.Controller;

import com.AngularCrud.AngularCrudDemo.Model.Employee;
import com.AngularCrud.AngularCrudDemo.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return empService.getAllEmplyee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return empService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empService.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return empService.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return empService.deleteEmployeeBYId(id);
    }
}
