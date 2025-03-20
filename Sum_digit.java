import java.util.Scanner;
public class Sumdigit{
public static void main(String[]args){
Scanner sn =new Scanner(System.in);
int num=sn.nextInt();
int k=num;
int rem=0;
int result=0;
while(num>0){
rem=num%10;
result+=rem;
num/=10;
}
System.out.println("given_num:"+k);
System.out.println("sum_digit:"+result);
}
}
