package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue

    private  int empId;
    private  String empName;
    private  String empLastName;
    private  double empSalary;
    private  long empContactNumber;
    private  String empEmailId;
    private  String empPassword;
    private Date empDOB;

}
