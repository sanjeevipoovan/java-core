import java.util.Scanner;
public class Armstrong{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int num=in.nextInt();
int temp=num;
int pow=0;
int rem;
while(num>0){
rem=num%10;
pow=pow+(rem*rem*rem);
num/=10;
}
if(temp==pow){
System.out.println("it's a armstrong_num:"+temp);
}
else{
System.out.println("not a armstrong_num:"+temp);
}
}
}