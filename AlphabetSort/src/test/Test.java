/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author SHEKHAR
 */
import java.util.Arrays;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
   // char [] a = {'-','-','-','-','-','-'};//6
    //char  b = '-';//6
    //int e = 0;
    
   char [] sa = {'a','b','c','d','e'};
       char [] h = {};
       String a = "edcba";
       int control = 0;
       int x = 0;
       boolean g=false;
       
       //code to srt alphabetically
       h= a.toCharArray();
        Arrays.sort(h);
       
       //shows sorted array
       for(int f = 0;f<5;f++){
       System.out.print(h[f]+" ");}
       
      
       for( int b = 0;b<5;b++){
           
       for(int p=0;p<a.length();p++){
       control = Character.compare(sa[b],h[p]);
       System.out.println(control);
       if(control == 0){System.out.println("\nMatch Found "+h[p]);}
       }}
    
    
    }
    
}
  /* 
  //checks if all lett
    for(int c = 0;c<6;c++){  
        e = Character.compare(a[c],b);
        System.out.println(e);
    }
*/