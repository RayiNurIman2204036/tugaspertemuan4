/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Rayin
 */
public class Nomor2 {
    
    
    static boolean prima(int x){
        int i;
        for(i = 2; i<10;i++){
            if(x < 10 ){
                
                        for ( i = 2 ; i <= Math.sqrt(x); i++) {
                    if (x % i == 0 || x < 1) {
                        return false;
                    }
                }

        return true;
                
            }else if(x % i == 0 ){
                return false;
            }
        }
        return true;
    }
    
     public static void main(String[] args) {
    int awal,akhir,i;
    System.out.printf("Masukan bilangan awal dan akhir: ");
    Scanner bilangan = new Scanner(System.in);
    awal = bilangan.nextInt();
    akhir = bilangan.nextInt();
    
    System.out.println("Bilangan prima " + awal + " sd "+ akhir +" adalah");
    for(i=awal;i<=akhir;i++){
    if(i > 1){    
    if(prima(i)){
        System.out.println(i);
                }
            }
        }
    }
}
