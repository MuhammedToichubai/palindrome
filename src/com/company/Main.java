package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(isPolindrom("A man, a plan, a canal: Panama"));
        

    }public static boolean isPolindrom(String s ){


            s= s.replaceAll("[^a-zA-Z0-9]", "");
            s=s.toLowerCase(Locale.ROOT);
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }i++;
                j--;
            }

            return true;
        }
    static String palindrome(){
        String str = " A man, a plan, a canal: Panama";
        String toUp = str.toLowerCase(Locale.ROOT);
        String replace = toUp.replace(",", "");
        String replace1 = replace.replace(":","");
        String replace2 = replace1.replaceFirst(" ","");

        return replace2;
    }







}

