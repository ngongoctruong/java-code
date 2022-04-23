import java.util.Scanner;

public class gioithieubanthan {
    public static void main(String[] args) {
        Scanner CD = new Scanner(System.in);
        System.out.printf("Nhập họ và tên: ");
        String ten = CD.nextLine();

        System.out.printf("Nhập tuổi: ");
        int tuoi = Integer.parseInt(CD.nextLine());

        System.out.printf("Nhập giới tính: ");

        String gioitinh = CD.nextLine();

        System.out.printf("Nhập quê quán: ");
        String quequan = CD.nextLine();

        System.out.println("Xin chào các bạn, mình tên là " + ten + " năm nay mình " + tuoi + " tuổi,giới tính " + gioitinh + ".Hiện nay mình đang sống và làm việc tại "+ quequan +".");
    }
}
