package com.company;

import java.util.Scanner;

public class lab23 {
    public static void main(String[] args) {
        Scanner dang = new Scanner(System.in);
        System.out.println("Nhap so: ");
        double a = dang.nextDouble();
        System.out.println("Nhap so: ");
        double b = dang.nextDouble();
        System.out.println("Nhap so: ");
        double c = dang.nextDouble();
        System.out.println("Nhap so: ");
        double d = dang.nextDouble();
        double max = a;
        double min = a;
        if(max<b){
            max=b;
            System.out.println("So lon nhat la: "+max);
        }
        if(max<c){
            max=c;
            System.out.println("So lon nhat la: "+max);
        }
        if(max<d) {
            max=d;
            System.out.println("So lon nhat la: "+max);
        }
        if(min>b){
            min=b;
            System.out.println("So nho nhat la: "+min);
        }
        if(min>c){
            min=c;
            System.out.println("So nho nhat la: "+min);
        }
        if(min>d) {
            min=d;
            System.out.println("So nho nhat la: "+min);
        }

    }
}
