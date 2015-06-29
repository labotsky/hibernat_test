package com.simple.entity;

import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Сергей on 27.06.2015.
 */
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue
    @Column(name = "department_id")
    private Long departmentId;
    @Column(name = "dept_name")
    private String departmentName;
    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="department_id")
    @IndexColumn(name="idx")
    private List<Person> persons;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
