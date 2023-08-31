package view;
import java.util.ArrayList;

public class ExemploLista {

    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Branco"); //0
        cores.add("Azul");   //1
        cores.add("Preto");  //2
        cores.add("Verde");  //3
        cores.add("Vermelho"); //4

        System.out.println("todos os elementos: " + cores.toString()); // exibe todos elementos do Array
        System.out.println("tamanho do array: " + cores.size()); // exibe o tamanho do Array
        System.out.println("pocição 0 d0 array: " + cores.get(2)); // exibe a posição 2 do Array
        System.out.println("Indice da cor Branco: " + cores.indexOf("Branco"));// exibe o indice da cor Branco

        cores.remove("Vermelho");// remove vermelho
        System.out.println("todos os elementos: " + cores.toString()); // exibe todos elementos do Array menos o vermelho
        System.out.println("Tem azul ? " + cores.contains("Azul")); // verifica se tem azul
        System.out.println("Tem Vermelho ? " + cores.contains("Vermelho")); // verefica se tem vermelho

    }

}
