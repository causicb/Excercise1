public class Main {

    public static void main(String[] args) {

        //casting example
        int a = 5;
        int b = 2;
        double result = (double) a / b;
        System.out.println(result);

        //variables
        double absExample = -3.5;
        int powExample = 2;
        double roundExample = 3.48;
        int sqrtExample = 4;

        //various examples
        System.out.println(Math.abs(absExample));
        System.out.println(Math.pow(powExample, 2));
        System.out.println(Math.round(roundExample));
        System.out.println(Math.sqrt(sqrtExample));
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //if example
        if (a == 5) {
            a = a + 1;
            System.out.println("value of \"a\" is " + a);
        } else if (a == 6) {
            a = a + 2;
            System.out.println(a);
        } else {
            a = a + 3;
            System.out.println(a);
        }

        //switch example
        a = 5;
        switch (a) {
            case 5: {
                System.out.println("Jednako 5");
                a = a + 1;
            }

            case 6: {
                System.out.println("Jednako 6");
                a = a + 2;
            }

            case 7: {
                System.out.println("Jednako 7");
                a = a + 3;
            }
        }
    }
}
