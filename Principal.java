//package Anagrama;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner;

//import QuickSort.QuikSort2;
//import QuikSortInteger.Quick;
//import Secundario.QuikSort2;

public class Principal{

    public static void main(String[] args) throws IOException {
    	
    	//exemplo
    	//char x1[] = {'b','b','b','r','b','r','g'};
    	
    	
    	//int x2[] = {2,30,10,9,5};
    	
    	
    	Scanner aux = new Scanner(System.in);
        System.out.println("Insira o tamanho dos dois vetores");
    	int tam = aux.nextInt();
    	
    	char []x1 = new char[tam];

    	int x2[] = new int[tam];


    	String aux2 = "";
        System.out.println("Insira os caracteres do primeiro vetor");
    	for(int i = 0; i < tam + 1; i++){
    		aux2 = aux2 + aux.nextLine() ;
    		
    	}


    	x1 = aux2.toCharArray();
        
    	System.out.println("Insira os dados numéricos do segundo vetor");
    	for(int i = 0; i < tam; i++){
    		x2[i] = aux.nextInt();
    	}
    	


    	QuikSort2.quick_sort(x1, 0, tam-1,x2);
    
    	
    	
    	for(int j = 0; j < tam; j++){
			System.out.print(x1[j] + " , ");
		}
    	System.out.println();
    	for(int j = 0; j < tam; j++){
			System.out.print(x2[j] + " , ");
		}
    	
    	
    	
    }
}