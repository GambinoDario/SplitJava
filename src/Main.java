import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la frase da dividere: ");
        String input = scan.nextLine();
        System.out.println("Inserisco il carattere");
        char regex = (scan.nextLine().charAt(0));
        char[] inputArray = new char[input.length()+1];
        inputArray = input.toCharArray();
        inputArray[inputArray.length-1] = regex;
        int presenza = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == regex){
                presenza++;
            }
        }
        String[] risultatoArray = new String[presenza+1]; //le stringhe nell'array è sempre +1 pk quando si divide si creano 2 risultati (+2 per l'ultimo valore che sennò è null
        String risultato = "";
        int j = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] != regex){
                risultato += inputArray[i];
            }else{
                risultatoArray[j] = risultato;
                j++;
                risultato = "";
            }
        }
        for (int i = 0; i < risultatoArray.length; i++) {
            System.out.println(risultatoArray[i]);
        }
    }
}