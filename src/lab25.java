import java.util.Scanner;

public class lab25 {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in);
        System.out.println("Nhap so km: ");
        double km = dang.nextDouble();
        double gia1= 15000; // <= 1 km
        double gia2= 13500; // <= 5 km
        double gia3= 11000; //  > 5 km
        double tongtien = 0;
        if (km<=1){
            tongtien = km * gia1;
            System.out.println("Tong tien la: "+tongtien+"vnd");
        }else
        if(km<=5){
            tongtien = gia1 + gia2 * (km-1) ;
            System.out.println("Tong tien la: "+tongtien+"vnd");
        }
        if(km>5){
            tongtien = gia1 + gia2*4 + gia3*(km-5);
            System.out.println("Tong tien la: "+tongtien+"vnd");
        }
        if(km>120){
            tongtien= tongtien - tongtien * 10/100;
            System.out.println("Tong tien la: "+tongtien+"vnd");
        }


        }
    }

