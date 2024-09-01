import java.util.*;
class Leap_year{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 && year%400==0){
            System.out.print("leap year");
        }else{
            System.out.print("Not a leap year : ");
        }
        sc.close();
    }
}
