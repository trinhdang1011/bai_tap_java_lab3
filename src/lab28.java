import java.util.Scanner;

public interface lab28 {
    public static void main(String[] args) {
        Scanner dang= new Scanner(System.in);
        System.out.println("Moi nhap so thu 1:");
        int a = dang.nextInt();
        System.out.println("Moi nhap so thu 2:");
        int b = dang.nextInt();
        System.out.println("        MENU        ");
        System.out.println("====================");
        System.out.println("         +");
        System.out.println("         -");
        System.out.println("         *");
        System.out.println("         /");
        System.out.println("====================");
        System.out.print("Moi chon phep tinh:");
        char n= dang.next().charAt(0);
        switch (n){
            case '+':
                System.out.println("Ket qua tong cua "+ a + " + " + b + " la: " +(a + b));
                break;
            case '-':
                System.out.println("Ket qua hieu cua "+ a + " - " + b + " la: " +(a - b));
                break;
            case '*':
                System.out.println("Ket qua tich cua "+ a + " * " + b + " la: " +(a * b));
                break;
            case '/':
                System.out.println("Ket qua tong cua "+ a + " / " + b + " la: " +(a / b));
                break;
            default:
                System.out.println("Ban chon sai phep tinh ,moi chon lai !!!");
        }


    }
}
