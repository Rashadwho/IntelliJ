package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

@SpringBootApplication


public class Sum {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st digit: ");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd digit: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of 2 Integers: "+sum);
    }

}



