import java.util.Scanner;

public class lab27 {
    public static void main(String[] args) {
        System.out.println("        MENU        ");
        System.out.println("====================");
        System.out.println("1. CF");
        System.out.println("2. DF");
        System.out.println("3. EF");
        System.out.println("4. FF");
        System.out.println("5. HF");
        System.out.println("6. IF");
        System.out.println("====================");
        Scanner dang= new Scanner(System.in);
        System.out.print("Moi chon:");
        int n= dang.nextInt();
        switch (n){
            case 1:
                System.out.println("Ban chon CF");
                break;
            case 2:
                System.out.println("Ban chon DF");
                break;
            case 3:
                System.out.println("Ban chon EF");
                break;
            case 4:
                System.out.println("Ban chon FF");
                break;
            case 5:
                System.out.println("Ban chon HF");
                break;
            case 6:
                System.out.println("Ban chon IF");
                break;
            default:
                System.out.println("So ban nhap phai nam trong khoang 1 toi 6");

        }
    }
}
