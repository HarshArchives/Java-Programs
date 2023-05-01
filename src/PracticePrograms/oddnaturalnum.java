package PracticePrograms;


public class oddnaturalnum {
    public static void main(String[] args) {
        System.out.print("The First 10 Odd Natural Numbers are : ");
        int i = 1;
//        for(int i = 1 ; i<20 ; i+=2){
//            System.out.print(i+" ");
//        }
        while(i<11){
            System.out.print((2*i-1)+" ");
            i++;
        }
    }
}
