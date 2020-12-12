package com.mycompany.app;
import java.util.*;
import java.util.Scanner;

/**
 * Projeto Final da matéria de Laboratório de Engenharia de Software
 */
public class App
{
    /*Declara Appteste*/
    public App() {}
    public static void main(String[] args) {
		
		int num1= 10;
		int num2= 5;
		
		System.out.println(soma(num1,num2));
		System.out.println(sub(num1,num2));
		System.out.println(multi(num1,num2));
		System.out.println(divi(num1,num2));
		
    }
    
    /*declara funções*/
    public static int soma(int a, int b)
    {
        int res = a + b;
        return res;
    }
    
    public static int sub(int a, int b)
    {
        int res = a - b;
        return res;
    }
    public static int multi(int a, int b)
    {
        int res = a * b;
        return res;
    }
    public static int divi(int a, int b)
    {
        int result = a / b;
        return res;
    }
}
