import java.util.Scanner;
public class Calculator{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int result=0;
while(true){
char op=in.next().trim().charAt(0);
if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
System.out.println("enter two numbers:");
int num1=in.nextInt();
int num2=in.nextInt();
if(op=='+'){
result=num1+num2;
}
if(op=='-'){
result=num1-num2;
}
if(op=='*'){
result=num1*num2;
}
if(op=='/'){
if(num2!=0){
result=num1/num2;
}
if(op=='%'){
result=num1%num2;
}
}
else if(op=='x'||op=='X'){
break;
}else{
System.out.println("invalid operation");
}
System.out.println(result);
}
}
}
