 import java.util.Scanner;

    public class lab29 {
        public static void main(String[] args) {
            Scanner dang= new Scanner(System.in);
            System.out.println("Moi nhap toa do diem A");
            System.out.println("xA: ");
            int xA= dang.nextInt();
            System.out.println("yA: ");
            int yA= dang.nextInt();
            System.out.println("Moi nhap toa do diem B");
            System.out.println("xB: ");
            int xB= dang.nextInt();
            System.out.println("yB: ");
            int yB= dang.nextInt();
            System.out.println("Moi nhap toa do diem C");
            System.out.println("xC: ");
            int xC= dang.nextInt();
            System.out.println("yC: ");
            int yC= dang.nextInt();
            double a=Math.sqrt(Math.pow(xB-xA,2)+Math.pow(yB-yA,2));
            double b=Math.sqrt(Math.pow(xC-xB,2)+Math.pow(yC-yB,2));
            double c=Math.sqrt(Math.pow(xC-xA,2)+Math.pow(yC-yA,2));

            if(a+b>c && a+c>b && b+c>a){
                if(a==b&&a==c){
                    System.out.println("Day la tam giac deu");
                }else if(a==b || a==c || b==c){
                    System.out.println("Day la tam giac can");
                }else{
                    System.out.println("Day la tam giac");
                }

            }else{
                System.out.println("Day khong phai la tam giac");
            }


        }

    }


