package ex02;

public class Ex02 {
    public static void main(String[] args) {

        int numero = 3;

        boolean numeroPar = (numero % 2 == 0);

        System.out.println(numeroPar);

        if (numero % 2 == 0){
            System.out.println("É par.");
        }else {
            System.out.println("É ímpar.");
        }
    }
}
