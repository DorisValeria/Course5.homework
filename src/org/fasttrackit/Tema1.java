package org.fasttrackit;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Tema1 {
    private static String[] names = new String[]{"Andrei", "Marius", "Andreea","Maria Clara Popescu", "Maria", "Ion", "Ana"};

    public static void main(String[] args) {
        ex1();
        ex2("eea");
        ex3();
        ex4();
        ex5();
        ex6();
    }

    public static void ex1() {
        for (String nume : names) {
            if (nume.startsWith("A")) {
                System.out.println(nume);
            }
        }
    }

    public static void ex2(String given) {
        for (String nume : names) {
            if (nume.contains(given)) {
                System.out.println(nume);
            }

        }


    }
    public static void ex3(){
        for(String nume:names){
            System.out.println(nume.replace('r','*'));
        }
    }

    public static void ex4(){
    for(String numele:names){
        System.out.println(numele.substring(0,3));
    }
    }

   public static void ex5() {
       Random random = new Random();
       for (String nume : names) {
           int pozitia = random.nextInt(nume.length());
           System.out.println(nume.charAt(pozitia));
       }
   }

   public static void ex6() {  //ma intereseaza daca are 3 nume si sa il abreviez pe cel din mijloc
        for(String nume:names){

            String [] componente=nume.split(""); //ii punem split dupa spatiu.Practic cu fiecare spatiu stim ca incepe un nou nume
            if(componente.length==3){ //vrem sa vedem daca lungimea e egala cu 3 de aceea trb sa folosim functia de length si sa egalam cu nr 3 pt ca ne intereseaza sa fie egal cu 3
               // 0 ,1,2=cele 3 pozitii ne intereseaza doar cel de pe lungimea 1 sa fie cel abreviat
                // Maria Clara Popescu= maria e componente[0]+ clara e componente[1] dupa care folosim functia charAt deoarece vrem sa printam din numele Clara doar litera C si Popescu e componente[2]
                System.out.println(componente[0] + componente[1].charAt(0)) + " . " + " " + componente[2]);
                System.out.println("Modificare din git");
            }
        }
   }

}