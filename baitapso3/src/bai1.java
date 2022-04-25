public class bai1 {
    public static void main(String[] args) {
        // Bài 1

        String name = "a";


        System.out.println(saochep(name));
    }
    public static String saochep(String name){
        String ketqua="";
        for (int i=0 ; i<10; i++ ){
            ketqua = ketqua + name;

        }
        return ketqua;
    }

}
