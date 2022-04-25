import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Nhập bán kính : ");
        double bankinh = sc.nextDouble();
        System.out.println("Thể tích hình cầu là:"+thetich(bankinh));


    }
    public static double thetich(double a){


        double Vhinhcau = ((double) 4/3)*3.14*(a*a*a);
        return Vhinhcau;
    }
}
