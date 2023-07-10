package com;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    String designation;
    Scanner sc=new Scanner(System.in);
    Employee(){
        System.out.println("Enter ID: ");
        int id=sc.nextInt();
        System.out.println("Enter Name: ");
        String name=sc.next();
        System.out.println("Enter Designation: ");
        String designation=sc.next();
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(designation);

    }
}

public class Project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList<Employee>();
        int choice=0;
        do {
            System.out.println("Enter choice: ");
            System.out.println("1) Add Record");
            System.out.println("2) Display Record");
        } while (choice<3);
    }
}
