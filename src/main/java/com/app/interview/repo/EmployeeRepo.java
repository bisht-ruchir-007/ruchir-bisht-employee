package com.app.interview.repo;

import com.app.interview.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e JOIN FETCH e.addresses a WHERE a.priority = " +
            "(SELECT MAX(a2.priority) FROM Address a2 WHERE a2.employee.id = e.id)")
    List<Employee> findAllWithMaxPriorityAddress();

}

