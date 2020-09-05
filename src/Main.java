import java.util.Scanner;

import exception.NuestraException;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[2];

        try {
            Curso.ganoCurso(3.5);
            scanner.nextLine();
        }catch (NullPointerException | NuestraException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("Entré al Finally");
        }

        System.out.println("Todo salió bien");
    }
}
