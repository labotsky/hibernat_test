package com.simple.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Сергей on 27.06.2015.
 */
@Entity
@Table(name = "employee")
@DiscriminatorValue("E")
public class Employee extends Person {

    @Column(name="joining_date")
    private Date joiningDate;
    @Column(name="department_name")
    private String departmentName;

    public Employee(String firstname, String lastname, Date joiningDate, String departmentName) {
        super(firstname,lastname);
        this.joiningDate = joiningDate;
        this.departmentName = departmentName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
