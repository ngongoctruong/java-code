public class bai4 {
    public static void main(String[] args) {

        System.out.println("Tổng các số chia hết cho 5 từ 0 đến 100 là : "+chia5());
    }
    public static int chia5(){
        int tong = 0;
        for(int i=0;i<=100;i++){
            if(i%5==0){
                tong= tong + i;
            }

        }
        return tong;
    }
}