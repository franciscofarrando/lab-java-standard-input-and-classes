package org.example;

public class Intern extends Employee{
private static final int SALARY_LIMIT = 20000;

    public Intern(int salary, int age, String email, String name,) {
        super(validateSalary(salary), age, email, name);

    }
    private static int validateSalary(int salary) {
        if(salary>SALARY_LIMIT){
            throw new IllegalArgumentException("Inter salary no puede ser mayor a: "+SALARY_LIMIT);
        }
        return (salary);
    }
    @Override
    public void setSalary(int salary){
        if(salary>SALARY_LIMIT){
            throw new IllegalArgumentException("Inter salary no puede ser mayor a: "+SALARY_LIMIT);
        }
        super.setSalary(salary);
    }
}
