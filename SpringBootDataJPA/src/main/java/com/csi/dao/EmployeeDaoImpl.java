package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee  signUp(Employee employee)
    {


       return  employeeRepo.save(employee);

    }

    public  boolean signIn(String empEmailId,String empPassword)
    {
        boolean flag=false;

        List<Employee> employeeList= employeeRepo.findAll();

        for (Employee e:employeeList)
        {
            if (e.getEmpEmailId().equals(empEmailId) && e.getEmpPassword().equals(empPassword))
            {
                flag=true;
            }

        }
         return flag;

    }

    public void saveAlldata(List<Employee> employees)
    {
      for (Employee emp:employees)
      {
          employeeRepo.save(emp);
      }

    }

    public Optional<Employee> getDataByID(int empId){

        return employeeRepo.findById(empId);
    }
    public  Employee getDataByName(String empName)
    {
        return employeeRepo.findByEmpName(empName);
    }
    public  Employee getByEmailId(String empEmailID)
    {
        return employeeRepo.findByEmpEmailId(empEmailID);
    }
    public  List<Employee> getAllData()
    {
        return employeeRepo.findAll();
    }
    public  Employee updataData(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public  void deleteDataByID(int empId)
    {
        employeeRepo.deleteById(empId);
    }
    public void deleteAllData() {
        employeeRepo.deleteAll();
    }
}

