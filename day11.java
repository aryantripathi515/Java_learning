// Q.) Write a Java program to check whether a person is eligible to vote.

import java.io.*;
class Check{
    public static void main(String ar[]){
        Console c = System.console();
        int age = Integer.parseInt(c.readLine("Enter Your Age:"));
        if(age>18){
            System.out.println("Person is eligible for vote!");
        }else{
            System.out.println("Person is noteligible for vote!");

        }
    }
}
