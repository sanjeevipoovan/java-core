import java.util.Scanner;
public class Rev{
public static void main(String[]args){
Scanner in =new Scanner(System.in);
int num=in.nextInt();
int rev=0;
while(num>0){
int rem=num%10;
num=num/10;
rev =rev*10+rem;
}
System.out.println(rev);
}
}