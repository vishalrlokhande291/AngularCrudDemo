package com.AngularCrud.AngularCrudDemo.Repository;

import com.AngularCrud.AngularCrudDemo.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends MongoRepository<Employee,Long> {


}
