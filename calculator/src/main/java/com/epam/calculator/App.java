package com.epam.calculator;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Enter an option:");
        int opt=sc.nextInt();
        if(opt<1 || opt>4) System.out.println("Invalid option");
        else if(opt==1) {
        	Addition ad=new Addition(a,b);
        	System.out.println("Addition of two numbers is :"+ad.addi());
        }
        else if(opt==2) {
        	Subtraction su=new Subtraction(a,b);
        	System.out.println("Subtraction of two numbers is :"+su.subt());
        }
        else if(opt==3) {
        	Multiplication mu=new Multiplication(a,b);
        	System.out.println("Multiplication of two numbers is :"+mu.mult());
        }
        else if(opt==4) {
        	Division dv=new Division(a,b);
        	System.out.println("Division of two numbers is :"+dv.divi());
        }
    }
}
