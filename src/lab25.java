import java.util.Scanner;

public class lab25 {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in);
        System.out.println("Nhap so km: ");
        double km = dang.nextDouble();
        double gia1= 15000; // <= 1 km
        double gia2= 13500; // <= 5 km
        double gia3= 11000; //  > 5 km
        if (km<=1){
            double tongtien1 = km * gia1;
            System.out.println("Tong tien la: "+tongtien1+"vnd");
        }else if(km<=5){
            double tongtien2 = gia1 + gia2 * (km-1) ;
            System.out.println("Tong tien la: "+tongtien2+"vnd");
        }
        if(km>5 && km<=120) {
            double tongtien3 = gia1 + gia2 * 4 + gia3 * (km - 5);
            System.out.println("Tong tien la: " + tongtien3 + "vnd");
        }else if(km>120){
            double i = 15000 + gia2 * 4 + gia3 * (km - 5);
            double tongtien4= i - i * 10/100;
            System.out.println("Tong tien la: "+tongtien4+"vnd");
        }


        }
    }

