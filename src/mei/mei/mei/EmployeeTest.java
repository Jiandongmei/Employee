package mei.mei.mei;

public class EmployeeTest {
    public static void main(String []args)
    {
//先用Employee创建三个员工并赋值
        Employee [] staff = new Employee[3];
        staff[0 ]= new Employee("梅建东",7777,1999,12,12);
        staff[1] = new Employee("吴晓羽",6666,2000,1,1);
        staff[2] = new Employee("夏依春",5666,2000,3,12);
        for (Employee e :staff)
            e.raiseSalary(5);
        //增加百分之五的薪金报酬
        for (Employee e :staff)
            System.out.println("姓名"+e.getName()+"薪金"+e.getSalary()+"工龄"+e.getHireDay());


    }
}
