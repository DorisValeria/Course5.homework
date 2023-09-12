package org.fasttrackit;
//PENTRU ASTEA 2 SA MA MAI UIT INCA DE 5 ORI LA EXPLICATIILE DE LA ACESTE EXERCITII
public class Aprofundare {

    public static void main(String[] args) {
        ex5(12,"curs5");
        divide(100,10); //o sa am nev de fix 10 elemente
    }
    public static void ex5(int size, String toBeAdded){ //sa ma mai reuit inca o data la ex respectiv
        if(toBeAdded.length()>=size){
            System.out.println(toBeAdded);
            return;
        }
        int emptySlots=size-toBeAdded.length();
        String finalString="";
        for(int i=0;i<emptySlots; i++){
            finalString=finalString.concat("x"); //aici il suprascriu deci scriu finalString=finalString.concat
        }
        finalString=finalString.concat(toBeAdded);
        System.out.println(finalString);
        // o alta metoda cu StringBuilder
    }

    public static int [] divide(int n,int k){
       // int ct=0;
        int sizeArray=n/k;
        int index=0;
        int [] divizori=new int[sizeArray];// mi am definit un array de divizori care stiu ca va avea acea dimensiune
        for(int i=1; i<=n;i++){
            if(i %k==0){
               divizori[index]=i;
                index++;
                System.out.println("Modificare din git");
            }
        }
    }

}
