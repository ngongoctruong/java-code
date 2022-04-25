public class bai2 {
    public static void main(String[] args) {
        String name = "a";


        System.out.println(saochep(name));
    }
    public static String saochep(String name){
        String ketqua ="";


        for (int i=0 ; i<10; i++ ){
//            ketqua = ketqua + name + "-";
            if (i==9){
                ketqua = ketqua + name;
            }
            else {
              ketqua=  ketqua + name + "-";
            }
        }
        return ketqua;
    }

}

