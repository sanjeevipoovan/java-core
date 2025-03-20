import java.util.Arrays;
import java.util.Scanner;
public class Sum_arr{
public static void main(String[]args);
int[]arr=new int[5];
for(int i=0;i<10;i++){
Scanner in=new Scanner(System.in);
arr[i]=in.nextInt();
}
for(int i:arr)
int sum+=i;
System.out.println(sum);
}
}
