/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author Rodayna
 */
import java.util.*;
public class NewClass {
     public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("write the sentence u want to test if it is palindrome");
    String s = o.next();
     int f = s.length()-1;
     int i = 0;
   while (i < f){
    if(s.charAt(i) != s.charAt(f)){
        System.out.println("no it is not palindrome");
        break;
    }else{
        i++;
      f--;}   System.out.println("yes it is palindrome"); break; } 
      
     
     }}



    

