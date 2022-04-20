public class Main {

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println((double) b/a);

        System.out.println(BMI(60,1.68));

    }

    public static double BMI(int a, double b) {
        double sum= a/(b*b);
        return sum;
    }
}



