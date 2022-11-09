package com.AngularCrud.AngularCrudDemo.Service;

import com.AngularCrud.AngularCrudDemo.Exception.ResourceNotFoundException;
import com.AngularCrud.AngularCrudDemo.Model.Employee;
import com.AngularCrud.AngularCrudDemo.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public List<Employee> getAllEmplyee(){
        return empRepo.findAll();
    }

    public Employee getEmployeeById(int id){
        return empRepo.findById((long) id).orElseThrow(()->new ResourceNotFoundException("Employee Not Fount with id: "+id));
    }

    public Employee addEmployee(Employee employee){
        return empRepo.save(employee);
    }

    public Employee updateEmployee(int id,Employee employee){
        Employee employee1=empRepo.findById((long) id).orElseThrow(()->new ResourceNotFoundException("Employee Not Fount with id: "+id));
        employee1.setfName(employee.getfName());
        employee1.setlName(employee.getlName());
        employee1.setEmailId(employee.getEmailId());

        return empRepo.save(employee1);
    }

    public String deleteEmployeeBYId(Long id){
        empRepo.deleteById(id);
        return "Deleted...!";
    }

}
