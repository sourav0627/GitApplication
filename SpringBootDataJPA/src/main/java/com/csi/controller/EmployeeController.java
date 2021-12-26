package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/signup")
    public Employee signUp(@RequestBody Employee employee)
    {
        log.info("************Trying to SignUp for Employee: "+ employee.getEmpName());
        return employeeService.signUp(employee);

    }
  @GetMapping("/signIn/{empEmailId}/{empPassword}")
    public boolean signIn(@PathVariable String empEmailId, @PathVariable String empPassword)
  {
      return employeeService.signIn(empEmailId, empPassword);

  }

  @PostMapping("/savealldata")
    public  String saveAllData(@RequestBody List<Employee> employees)
  {
      employeeService.saveAlldata(employees);
      return "save data succesfully";
  }
  @GetMapping("/getdatabyId/{empId}")
    public Optional<Employee> getDataById(@PathVariable int empId)
  {
      return employeeService.getDataByID(empId);
  }
  @GetMapping("/getdataByName/{empName}")
    public  Employee getDataByName(@PathVariable String empName)
  {
      return employeeService.getDataByName(empName);
  }
  @GetMapping("/getDatabyEmailid/{empEmailId}")
    public  Employee getDataByEmailId(@PathVariable String empEmailId)
  {
      return employeeService.getByEmailId(empEmailId);
  }
    @GetMapping("/getalldata")
    public List<Employee> getAllData()
    {
       return employeeService.getAllData();
    }

    @PutMapping("/updateData/{empId}")
    public Employee updateData(@PathVariable int empId,@RequestBody Employee employee)
    {
        return employeeService.updataData(employee);
    }

    @DeleteMapping("/deletedatabyId/{empId}")
    public String deleteDataById(@PathVariable int empId)
    {
        employeeService.deleteDataByID(empId);
        return "Delete Data Succesfully";
    }
    @DeleteMapping("/deletealldata")
    public  String deleteAllData()
    {
        employeeService.deleteAllData();
        return "all data delete succesfully";

    }
}
