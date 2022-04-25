import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập chuỗi:");
        String name = sc.nextLine();

        System.out.print("Số lần lặp lại:");
        int n = sc.nextInt();

        System.out.println(saochep(name,n));
    }
    public static String saochep(String name,int n){
        String ketqua ="";


        for (int i=0 ; i<n; i++ ){

            if (i==n-1){
                ketqua = ketqua + name;
            }
            else {
                ketqua=  ketqua + name + "-";
            }
        }
        return ketqua;
    }

}
