/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz;

/**
 *
 * @author cesar
 * Desarrollar una aplicación JAVA que cree una matriz, la llene de numeros enteros y los muestre por pantalla
 */
public class Matriz {

    public static void main(String[] args) {
        String matriz [][]= new String[3][4];
        for (int i=0;i<matriz.length;i++){
            System.out.println();
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]="x";
                System.out.print(matriz[i][j]);
            }   
        }
        
    }
}
  
