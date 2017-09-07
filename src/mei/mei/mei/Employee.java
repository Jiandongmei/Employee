package mei.mei.mei;

import java.time.LocalDate;

/*
员工类，用来记录员工的基本信息
 */
public class Employee {
    private String name;//姓名
    private double salary;//薪金
    private LocalDate hireDay;//工龄
    public Employee(String n , double s ,int year , int month, int day){
        name = n;
        salary = s;
        LocalDate.of(year,month,day);

    }
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
        //薪金方法
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public double getSalary() {

        return salary;
    }

    public String getName() {

        return name;
    }
}
