import java.util.Scanner;

public class lab_26 {
    public static void main(String[] args) {

        Scanner dang =new Scanner(System.in);
        System.out.println("Nhap ki tu:");
        char apl=dang.next().charAt(0);
        if(apl>=65 && apl<=90 ||apl>=97 && apl<=122){
            switch (apl){
                case 'o':
                case 'O':
                case 'e':
                case 'E':
                case 'u':
                case 'U':
                case 'i':
                case 'I':
                case 'a':
                case 'A':
                    System.out.println("Day la nguyen am");
                    break;

                default:
                    System.out.println("Day la phu am");
            }
        }else{
            System.out.println("Ki tu vua nhap khong thuoc bang chu cai");
        }
    }
}
