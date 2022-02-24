package com.company.day8.mapping.employee;

public class Department {
    private Integer id;
    private String departmentName;
    private Employee employee;

    public Department() {
    }

    public Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", departmentName='" + departmentName + '\'' + ", employee=" + employee + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
