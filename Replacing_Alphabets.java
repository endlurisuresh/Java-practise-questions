public class Replacing_Aphabets {
    public static void main(String[]args){
        String str="apple";
        int l=str.length();
        char []arr=new char[l];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        for(int i=0;i<l;i++){
            if(arr[i]=='a'){
                arr[i]='p';
            }
            else if(arr[i]=='p'){
                arr[i]='a';
            }
            else{
                arr[i]=arr[i];
            }
        }
       
       for(int i=0;i<l;i++){
        System.out.print(arr[i]);
       }
    }
}
