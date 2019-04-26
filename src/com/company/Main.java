package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] rice = {"white rice", "brown rice ", "no rice"};
        String[] meat  = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String[] beans= {"pinto beans", "black beans", "no beans"};
        String[] salsa= {"mild salasa", "medium salasa", "hot salsa", "no salsa", "all salsa"};
        String[] veggies = {"lettuce", "fajita veggies","all veggis"};
        String[] cheese  = {"with cheese","no cheese"};
        String[] guac = {"with guac","no guac"};
        String[] queso = {"with Queso","NO Queso"};
        String[] soureCream = {"with soure cream","no soure cream"};
        Random rand = new Random();
        double price ;

        for(int i = 1; i<=25; i++){
            int numberIngredents = rand.nextInt(4)+5;
            if(numberIngredents==5){
                System.out.print("Burrito " +i+": "+ rice[rand.nextInt(rice.length-1)]+", "+meat[rand.nextInt(meat.length-1)]+", "+beans[rand.nextInt(beans.length-1)]+", ");
                System.out.println(salsa[rand.nextInt(salsa.length-1)]+", "+veggies[rand.nextInt(veggies.length-1)]);
                price = 3+5*.5;
                System.out.printf("price: $%s \n\n",price);

            }
            if(numberIngredents==6){
                System.out.print("Burrito " +i+": "+ rice[rand.nextInt(rice.length-1)]+", "+meat[rand.nextInt(meat.length-1)]+", "+beans[rand.nextInt(beans.length-1)]+", ");
                System.out.println(salsa[rand.nextInt(salsa.length-1)]+", "+veggies[rand.nextInt(veggies.length-1)]+", "+cheese[rand.nextInt(rice.length-1)]);
                price = 3+6*.5;
                System.out.printf("price: $%s \n\n",price);
            }
            if(numberIngredents==7){
                System.out.print("Burrito " +i+": "+ rice[rand.nextInt(rice.length-1)]+", "+meat[rand.nextInt(meat.length-1)]+", "+beans[rand.nextInt(beans.length-1)]+", ");
                System.out.print(salsa[rand.nextInt(salsa.length-1)]+", "+veggies[rand.nextInt(veggies.length-1)]+", "+cheese[rand.nextInt(rice.length-1)]+", ");
                System.out.println(guac[rand.nextInt(guac.length-1)]);
                price = 3+7*.5;
                System.out.printf("price: $%s \n\n",price);
            }
            if(numberIngredents==8){
                System.out.print("Burrito " +i+": "+ rice[rand.nextInt(rice.length-1)]+", "+meat[rand.nextInt(meat.length-1)]+", "+beans[rand.nextInt(beans.length-1)]+", ");
                System.out.print(salsa[rand.nextInt(salsa.length-1)]+", "+veggies[rand.nextInt(veggies.length-1)]+", "+cheese[rand.nextInt(rice.length-1)]+", ");
                System.out.println(guac[rand.nextInt(guac.length-1)]+", "+ queso[rand.nextInt(queso.length-1)]);
                price = 3+8*.5;
                System.out.printf("price: $%s \n\n",price);

            }
            if(numberIngredents==9) {


                System.out.print("Burrito " + i + ": " + rice[rand.nextInt(rice.length - 1)] + ", " + meat[rand.nextInt(meat.length - 1)] + ", " + beans[rand.nextInt(beans.length - 1)] + ", ");
                System.out.print(salsa[rand.nextInt(salsa.length - 1)] + ", " + veggies[rand.nextInt(veggies.length - 1)] + cheese[rand.nextInt(rice.length - 1)] + ", ");
                System.out.println(guac[rand.nextInt(guac.length - 1)] + ", " + queso[rand.nextInt(queso.length - 1)] + ", " + soureCream[rand.nextInt(soureCream.length - 1)]);
                price = 3+9*.5;
                System.out.printf("price: $%s \n\n",price);
            }
        }

    }
}