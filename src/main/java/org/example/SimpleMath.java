package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;
public class SimpleMath
{
    public static void main( String[] args )
    {
        System.out.print( "What is the first number? " );
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        int inum1 = Integer.parseInt(num1);
        System.out.print( "What is the second number? ");
        String num2 = input.nextLine();
        int inum2 = Integer.parseInt(num2);

        int sum = inum1+inum2;
        int dif = inum1-inum2;
        int mult = inum1*inum2;
        int div = inum1/inum2;

        System.out.println(inum1+" + "+inum2+" = "+sum+ "\n"+inum1+" - "+inum2+" = "+dif+ "\n"+inum1+" * "+inum2+" = "+mult+ "\n"+inum1+" / "+inum2+" = "+div);


    }
}
