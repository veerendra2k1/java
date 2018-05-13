package com.brainbitz.operators;

public class EqualCheck {
    public static void main(String[] args){
        String a = "AVATAR";
        String b = "avatar";
        
        EqualCheck equalCheck = new EqualCheck();

        if(a.equals(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        if(a.equalsIgnoreCase(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }
}