import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner CV = new Scanner(System.in);
        System.out.printf("Nhập chiều dài = ");
        int CD = CV.nextInt();

        System.out.printf("Nhập chiều rộng = ");
        int CR = CV.nextInt();

        System.out.println("Chu vi diện tích hình chữ nhật = " + (CD+CR)*2);
        System.out.println("Diện tích hình chữ nhật = " + CD*CR);


    }
}