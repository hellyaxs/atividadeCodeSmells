package view;

import java.util.Scanner;


public class InterationUser {

    private static final Scanner scanner = new Scanner(System.in);

    public static int ScannerInput(){
        int escolha = scanner.nextInt();
        return escolha;
    }

    public static void showMessage(String msg){
        System.out.println(msg);
    }
}