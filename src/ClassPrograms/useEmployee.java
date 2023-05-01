package ClassPrograms;
import ClassPrograms.Employee;
public class useEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setE_Name("Harsh Vardhan Pandey");
        e1.setE_Id("22BTRCM005");
        e1.setSalary(73000);
        System.out.println("The information of Employee 1 is as follows : ");
        System.out.println("Employee Name is : "+e1.getE_Name());
        System.out.println("Employee Id is : "+e1.getE_Id());
        System.out.println("Salary is : "+e1.getSalary());

        Employee e2 = new Employee();
        e2.setE_Name("Sargam Poudel");
        e2.setE_Id("22BTRCN339");
        e2.setSalary(94000);
        System.out.println();
        System.out.println("The information of Employee 2 is as follows : ");
        System.out.println("Employee Name is : " + e2.getE_Name());
        System.out.println("Employee Id is : " + e2.getE_Id());
        System.out.println("Salary is : " + e2.getSalary());
    }
}
