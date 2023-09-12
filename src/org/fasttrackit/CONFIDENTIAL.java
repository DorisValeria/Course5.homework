package org.fasttrackit;

import java.util.Objects;

public class CONFIDENTIAL {

    public static void main(String[] args) {

        int numarPotriviri = charCount("testarettt", 't'); //am salvat intr-o variabila metoda pe care dorim sa o apelam , si scriem intre paranteze un cuvant si litera pe care vrem sa o controrizam si o injectam in formatedString
        String formatedString = String.format("Am gasit de %d in cuvant", numarPotriviri); //luam un string si ii"injectam inauntru parametriii(variabile intr-un string)
        System.out.println(formatedString); //la final printam string-ul formatedString

        String steluta = redact("Ana");
        System.out.println(steluta);

        System.out.println(contains(new String[]{"Ana", "Maria", "Ion", "Marius"},"Ion"));
       String [] aNaaremere=words("Ana are mere");//am apelat metoda de words cu "ANa are mere"si am pus-o intr-un string de array
        printArray(aNaaremere); //

        confidential("Ana are mere multe si Ana a mers sa mai cumpere mere", new String[]{"Ana", "mere"});
      // .equals =metoda prin care to poti sa verifici continutul oibectului respectiv.verifica continutul insine nu se uita doar la adresa
     // == verificare de adresa DOAR PENTRU PRIMITIVE
        //. equals -verificare de continut ,trebuie sa fie obiecte


    }

    public static int charCount(String x, char y) {  //Create a function that finds out how many times a char is in string.Pentru a numera cate caractere sunt intr-un cuvant
        int ct = 0;
        char[] charDinString = x.toCharArray();
        for (char charCurent : charDinString) { //daca caracterul meu este egal cu caracterul pe care vreau sa l verific
            if (charCurent == y) {
                ct = ct + 1; //de fiecare data cand gaseste,creste
            }
        }
        return ct;
    }

    public static String redact(String recievesString) {

        for (int i = 0; i < recievesString.length(); i++) { //accesam cu un for fiecare caracter rand pe rand si il schimbam cu *
            char charCurent = recievesString.charAt(i);//Am stocat in variabila de tip char,i cu care parcurgem elementele
            recievesString = recievesString.replace(charCurent, '*'); //trec prin fiecare caracter si il schhimb in steluta
        }
        return recievesString;

    }

    public static boolean contains(String[] arrayOfWords, String word) {
        boolean found = false;  //default ca este false
        for (String wordCurent : arrayOfWords) {
            if (wordCurent == word) {
                found = true; //daca da il transformam sa fie true, macar o data ne intereseaza sa gasim

            }
        }
       return found;
    }
     public static String [] words (String sentence){  //returneaza un array deci i am pus String [] words .numele metodei este words si input este un singur string
        String [] parts=sentence.split("");
        return parts;
     }
     public static void printArray(String [] array){
        for(String current:array){
            System.out.println(current); //printez pe fiecare linie
        }
     }

     //sa ne folosim de toate fct scrise mai sus si sa creem o alta functie care redacteaza o prop impreuna cu cateva cuvinte si le redacteaza si le transforma peste tot in stelute

 public static void confidential(String toBeChanged ,String [] toberedacted){
          String [] sentenceBrokendown=words(toBeChanged);//Am folosit metoda de mai sus pt a mi sparge propozitia in cuvinte

     //dupa aceea vreau sa iterez pentru fiecare cuvant pe care il am in propozitie
     for(int i=0;i< sentenceBrokendown.length;i++){
         for(int j=0;j< toberedacted.length;j++){
             if(sentenceBrokendown[i].equals(toberedacted[j])){
                 sentenceBrokendown[i]=redact(sentenceBrokendown[i]);
             }
         }
     }
     //printArray(sentenceBrokendown);
 }
}











