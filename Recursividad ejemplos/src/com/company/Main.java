package com.company;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 123;
        a = invertir(a);
        System.out.println(a);
    }

    public static  int invertir (int n)
    {
        if (n < 10)         //caso base
            return n;
        else
            return (n % 10) + invertir ((n/10) * 10);
    }
}
