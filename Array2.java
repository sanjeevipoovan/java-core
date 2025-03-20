import java.util.Arrays;
import java.util.Scanner;
public class Array2{
public static void main(String[]args){
Scanner sn=new Scanner(System.in);
String [] str=new String[4];
for(int i=0;i<str.length;i++){
str[i]=sn.next();
}
System.out.println(Arrays.toString(str));
}
}