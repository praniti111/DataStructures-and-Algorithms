import java.util.*;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1=sc.next();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int size=input1.length();
        String s=input1.substring(size-input2)+input1.substring(0, size-input2);
        System.out.println(s);
        int count=1;
        int f=0;
        while(!s.equals(input1)){
            if(f==0){
                s=s.substring(size-input3)+s.substring(0, size-input3);
                f=1;
                System.out.println(s);
            }
            else{
                s=s.substring(size-input2)+s.substring(0, size-input2);
                f=0;
                System.out.println(s);
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
