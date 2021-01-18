import java.util.Scanner;

public class bailab22 {
    public static void main(String[] args) {
        // Giai phuong trinh bac 2
        Scanner dang = new Scanner(System.in);
        System.out.println("Chuong trinh giai phuong trinh bac 2");
        System.out.println("Moi nhap a: ");
        int a=dang.nextInt();
        System.out.println("Moi nhap b: ");
        int b=dang.nextInt();
        System.out.println("Moi nhap c: ");
        int c=dang.nextInt();
        double delta = b*b - 4*a*c;
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (delta==0) {
            int x=-(b/(2*a));
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+x);
        }else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet :\nx1 = "+x1 + "\nx2 = "+x2);
        }
    }
}
