package com.bridge.labz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter month number");
        int m=ss.nextInt();
        System.out.println("Enter Day");
    int d=ss.nextInt();
    if (m<=3 && d<=20){
        System.out.println("true");
    }
    else {
        System.out.println("false");
    }
    }

}
