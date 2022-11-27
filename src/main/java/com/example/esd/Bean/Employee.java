package com.example.esd.Bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "title")
    private String title;

    @Column(name = "photograph_path")
    private String photographPath;

    @OneToMany(mappedBy = "faculty",fetch = FetchType.EAGER,cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    private List<Course> courseList;

    @ManyToOne
    @JoinColumn(name = "department",nullable = false)
    private Department department;

    public Employee(int employeeID, String firstName, String lastName, String email, String title, String photographPath, List<Course> courseList, Department department) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.photographPath = photographPath;
        this.courseList = courseList;
        this.department = department;
    }

    public Employee(String firstName, String lastName, String email, String title, String photographPath, List<Course> courseList, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.photographPath = photographPath;
        this.courseList = courseList;
        this.department = department;
    }

    public Employee() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotographPath() {
        return photographPath;
    }

    public void setPhotographPath(String photographPath) {
        this.photographPath = photographPath;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", photographPath='" + photographPath + '\'' +
                ", department=" + department +
                '}';
    }
}
