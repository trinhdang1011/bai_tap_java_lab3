package com.company;

import java.util.Scanner;

public class bailab24 {
    public static void main(String[] args) {
        Scanner dang = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = dang.nextDouble();
        System.out.println("Nhap b: ");
        double b = dang.nextDouble();
        System.out.println("Nhap c: ");
        double c = dang.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Day la tam giac");
        }else{
            System.out.println("Day khong phai la tam giac");
        }
    }
}
