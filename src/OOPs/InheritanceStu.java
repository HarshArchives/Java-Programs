package OOPs;

class person{
    private int age ;
    private String name;
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

class student extends person{
    private int rollno;
    public void setRollno(int r){
        rollno = r;
    }
    public int getRollno(){
        return rollno;
    }
}

public class InheritanceStu {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setRollno(6);
        s1.setName("Harsh");
        s1.setAge(18);
        System.out.println("Name : "+s1.getName());
        System.out.println("Age : "+s1.getAge());
        System.out.println("Roll_No. : "+s1.getRollno());
    }
}
