/* Taking two numbers from the user and printing their sum */

import java.io.*;
class Sum{
public static void main (String ar[]){
Console c=System.console();
int num1 = Integer.parseInt(c.readLine("Enter 1st Num:"));
int num2 = Integer.parseInt(c.readLine("Enter 2nd Num:"));
System.out.println("Sum:"+ (num1+num2));
}
}
