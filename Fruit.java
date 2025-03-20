import java.util.Scanner;
public class Fruit{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
String fruit =in.nextLine();
switch(fruit){
case "mango":
System.out.println("most liked fruit by everyone");
break;
case "apple":
System.out.println("keeps doctor away");
break;
case "orange":
System.out.println("contains vitamin c");
break;
default:
System.out.println("please provide a valid fruit");
}
}
}