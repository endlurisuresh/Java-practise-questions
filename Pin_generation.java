import java.util.*;
public class Pin_wipro {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input1 : ");
        int input1=sc.nextInt();
        System.out.println("Enter input2 : ");
        int input2=sc.nextInt();
        System.out.println("Enter input3 : ");
        int input3=sc.nextInt();
        ArrayList<Integer> all1=new ArrayList<>();
        ArrayList<Integer> pin=new ArrayList<>();
        ArrayList<Integer> all2=new ArrayList<>();
        while(input1>0){
            int temp=input1%10;
            all1.add(temp);
            input1=input1/10;  
        }
        while(input2>0){
            int temp=input2%10;
            all1.add(temp);
            input2=input2/10;
        }
        while(input3>0){
            int temp=input3%10;
            all1.add(temp);
            input3=input3/10;
        }
        Collections.sort(all1);
        pin.add(all1.get(0));
        pin.add(all1.get(all1.size()-1));
        for(int i=0;i<all1.size();i++){
            int key=all1.get(i);
            int count=0;
            for(int j=0;j<all1.size();j++){
                if(all1.get(j)==key){
                    count++;
                }
            }
            if(count==1){
               all2.add(key); 
            }
        }
        Collections.sort(all2);
        pin.add(all2.get(0));
        all2.clear();
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<all1.size();i++){
        int n=all1.get(i);
        if(hm.containsKey(n)){
            int prev=hm.get(n);
            hm.put(n,prev+1);
        }else{
            hm.put(n,1);
        }
        int maxval=Integer.MIN_VALUE;
        int maxkey=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>maxval){
                maxval=entry.getValue();
                maxkey=entry.getKey();
            }else if(entry.getValue()==maxval){
                maxkey=Math.max(maxkey,entry.getKey());
            
            }
        }
        all2.add(maxkey); 

      }
      pin.add(all2.get(all2.size()-1)); 
      System.out.print(" The pin is : "); 
      for(int i=0;i<pin.size();i++){
        System.out.print(pin.get(i));
      }
      sc.close();
    }

} 
