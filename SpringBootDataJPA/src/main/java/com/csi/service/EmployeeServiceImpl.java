package com.csi.service;


import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;


    public Employee signUp(Employee employee)
    {
        return  employeeDao.signUp(employee);

    }

    public  boolean signIn(String empEmailId,String empPassword)
    {

        return employeeDao.signIn(empEmailId,empPassword);

    }

    public void saveAlldata(List<Employee> employees)
    {
        employeeDao.saveAlldata(employees);
    }

    public Optional<Employee> getDataByID(int empId){

        return employeeDao.getDataByID(empId);
    }
    public  Employee getDataByName(String empName)
    {
        return employeeDao.getDataByName(empName);
    }
    public  Employee getByEmailId(String empEmailID)
    {
        return employeeDao.getByEmailId(empEmailID);
    }
    public  List<Employee> getAllData()
    {
        return employeeDao.getAllData();
    }
    public  Employee updataData(Employee employee)
    {
        return employeeDao.updataData(employee);
    }

    public  void deleteDataByID(int empId)
    {
        employeeDao.deleteDataByID(empId);
    }




    public void deleteAllData() {
        employeeDao.deleteAllData();
    }
}
