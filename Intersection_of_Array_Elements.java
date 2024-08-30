import java.util.*;
public class Intersecting_Array_elements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the al1 size :");
        int n=sc.nextInt();
        System.out.println("Enter the al1 size :");
        int m=sc.nextInt();
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        System.out.println("Enter the elements to al1 :");
        for(int i=0;i<n;i++){
            al1.add(sc.nextInt());
        }
        System.out.println("Enter the elements to al2 :");
        for(int i=0;i<m;i++){
            al2.add(sc.nextInt());
        }
        System.out.println(al1);
        System.out.println(al2);
        for(int i=0;i<n;i++){
            int key=al1.get(i);
            for(int j=0;j<m;j++){
                if(al2.get(j)==key){
                    al3.add(key);
                }
            }
        }
        for(int i=0;i<m;i++){
           int key=al2.get(i);
           for(int j=0;j<n;j++){
            if(al1.get(j)==key){
                al3.add(key);
            }
           }
        }
        System.out.println(al3);
    }
}
