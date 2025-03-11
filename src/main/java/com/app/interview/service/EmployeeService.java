package com.app.interview.service;

import com.app.interview.entity.Address;
import com.app.interview.entity.Employee;
import com.app.interview.repo.EmployeeRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepository;

    public EmployeeService(EmployeeRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
        initDB();
    }

    public List<Employee> getEmployeesWithMaxPriorityAddress() {
        return employeeRepository.findAllWithMaxPriorityAddress();
    }

    @PostConstruct
    public void initDB() {
        Address address1 = new Address("ABC", "Delhi", 1);
        Address address2 = new Address("XYZ", "Delhi", 2);
        Address address3 = new Address("UWD", "Delhi", 1);
        Address address4 = new Address("DEF", "Mumbai", 3);
        Address address5 = new Address("MNO", "Mumbai", 2);
        Address address6 = new Address("PQR", "Delhi", 4);
        Address address7 = new Address("HIJ", "Mumbai", 2);

        Employee employee1 = new Employee("Ruchir", List.of(address1, address2));
        Employee employee2 = new Employee("John", List.of(address3));
        Employee employee3 = new Employee("Sam", List.of(address4, address5, address6));
        Employee employee4 = new Employee("Sara", List.of(address7));

        address1.setEmployee(employee1);
        address2.setEmployee(employee1);
        address3.setEmployee(employee2);
        address4.setEmployee(employee3);
        address5.setEmployee(employee3);
        address6.setEmployee(employee3);
        address7.setEmployee(employee4);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        employeeRepository.save(employee4);

        System.out.println("DB init");
    }


}
