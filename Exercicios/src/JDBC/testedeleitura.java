package JDBC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testedeleitura {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("/teste.csv"));
        //String linha = scanner.nextLine();


            String linha = scanner.nextLine();
            System.out.println(linha);
    


        scanner.close();
    }
	}

