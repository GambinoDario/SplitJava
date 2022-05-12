import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings({"ForLoopReplaceableByForEach", "ExplicitArrayFilling"})
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la frase da dividere: ");
        String input = scan.nextLine();
        System.out.println("Inserisco il carattere");
        char regex = (scan.nextLine().charAt(0));
        char[] inputArray = input.toCharArray();
        int presenza = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == regex){
                presenza++;
            }
        }
        String[] risultatoArray = new String[presenza+1]; //le stringhe nell'array è sempre +1 pk quando si divide si creano 2 risultati
        for (int i = 0; i < risultatoArray.length; i++) {
            risultatoArray[i] = "";
        }
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == regex){
                j++;
            }else{
                risultatoArray[j] += inputArray[i];
            }
        }
        for (int i = 0; i < risultatoArray.length; i++) {
            System.out.println(risultatoArray[i]);
        }
    }
}