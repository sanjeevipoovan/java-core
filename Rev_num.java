import java.util.Scanner;
public class Rev_num{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int num=in.nextInt();
int ori_num=num;
int rem=0;
int rev=0;
while(num>0){
rem=num%10;
rev=rev*10+rem;
num/=10;
}
System.out.println("given_num:"+ori_num);
System.out.println("reverse_num:"+rev);
}
}
