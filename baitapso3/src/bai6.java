public class bai6 {
    public static void main(String[] args) {
        name();
    }
    public static void name() {

        for (int i = 0; i <= 100; i++){
            if (i%5==0 && i%3==0) {
                System.out.println(i +" FizzBuzz");
            }
            else if (i%3==0){
                System.out.println(i+" Fizz");

            } else if (i%5==0) {
                System.out.println(i+" Buzz");
            }else {
                System.out.println(i);
            }

        }
    }



}




