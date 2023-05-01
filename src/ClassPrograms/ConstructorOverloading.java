package ClassPrograms;

class Student{
    public static int s_Id,rank;
    public static String s_Name, f_name;

    public Student(int s_Id, int rank, String s_Name, String f_name) {
        Student.s_Id = s_Id;
        Student.rank   = rank;
        Student.s_Name = s_Name;
        Student.f_name = f_name;
    }


//    Using Getters & setters
//    public void setInfo(int s_Id, int rank , String s_Name , String f_Name){
//        Student.s_Id = s_Id;
//        Student.rank   = rank;
//        Student.s_Name = s_Name;
//        Student.f_name = f_Name;
//    }

    public int getInfo(){
        System.out.println("Student ID is : "+s_Id);
        System.out.println("Rank is : "+ rank);
        System.out.println("Student Name is : "+s_Name);
        System.out.println("Student's Father Name is : "+f_name);
        return 69;
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {
           Student s1 = new Student(12,69,"Harsh","Pandey");

//      s1.setInfo(12,120,"Harsh","Dhananjay Pandey");
          s1.getInfo();
    }
}
