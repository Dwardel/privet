package lab1;

public class Main {

    public static void libnic() {
        double chislo = 0;
        for (double i = 1; i < 10000; i += 1) {
            if (i % 2 == 0) {
                chislo -= 1 / i;
            } else {
                chislo += 1 / i;
            }
        }

        System.out.print(+chislo);
    }
/////////
    
    
   ////kjkj
    
    85448
    ///
    public static void main(String[] args) {
        libnic();
    }
}
