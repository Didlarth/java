package helloworld;

import javax.swing.JOptionPane;

public class HelloWorld {   
    
    public static void main(String[] args) {//Metodo donde dentro de el se empieza a ejecutar el codigos
        
        //Ensanchamiento de fundición
        int myInt = 9;
        double myDouble = myInt;
        
        System.out.println(myInt);
        System.out.println(myDouble);
        
        //Fundición de estrechamiento
        double myNewDouble = 9.78d;
        int myNewInt = (int) myNewDouble;
        
        System.out.println(myNewDouble);
        System.out.println(myNewInt);
        
        //*******************************************************
        
        String text = "Hello World";
        System.out.println("La medida del string es: "+text.length()); //Medida
        System.out.println(text.toUpperCase()); //Mayusculas
        System.out.println(text.toLowerCase()); //Minusculas

        String textOne = "Por favor tira tu 'basura' XD";
        System.out.println(textOne.indexOf("basura"));//Aparicion del texto

        //*******************************************************
       
        //Concatenación
        String name = "David ";
        String lastName = "Aguilar";
        String nameComplete = name+lastName;
        
        System.out.println(nameComplete); 
       
        //Concatenación concat()
        
        String namePerrito = "Perrito ";
        String lastNamePerrito = "Crush";
        System.out.println(namePerrito.concat(lastNamePerrito));
        
        //*********************************************************
        
        //Clase Math
        int num1 = 9, num2 = 30;
        System.out.println(Math.max(num1,num2)); //El numero más grande
        System.out.println(Math.min(num1, num2)); //El numero más pequeño
        System.out.println(Math.sqrt(num1)); //Raiz cuadrada
        System.out.println(Math.abs(-10)); //Devuelve el valor absoluto
        
        //Clase contains
        String buscarPalabra = "Hola mi nombre es David";
        System.out.println("Verificamos si el String contiene la palabra 'Nombre': " + buscarPalabra.contains("es"));
        
        for(int i=0;i<=5;i++){
            int numeroRandom = (int)(Math.random()*3+1); //Declaramos un numero random
            System.out.println(numeroRandom);
        }
        
        //*********************************************************
        
        int myAge = 19;
        int votingAge = 18;
        
        if(myAge >= 18){
            System.out.println("Eres un adulto");
        }else{
            System.out.println("No eres un adulto pa :,v");
        }
        
        //Operador Ternario
        
        String edad = (myAge >= votingAge) ? "Adulto" : "No adulto";
        System.out.println(edad);
        
        //*********************************************************
        
        int day = 1;
        switch(day){
            case 1:
                System.out.println("Hello World");
            break;
            case 2:
                System.out.println("Hi");
            break;
            case 3:
                System.out.println("Bye World");
            break;
        }
        
        //**********************************************************
        
        int i = 0;
        while(i<4){
            System.out.println(i);
            i++;
        }
        
        //**********************************************************
        
        do{
            System.out.println("Hello World");
            if(5 == 0){
                System.out.println("XD");
            }
        } while( 5 == 0);
        
        //************************************************************
        
        for(int x=1; x<=2; x++){
            System.out.println("Lista: " + x);
            
            for(int j=1; j<=3; j++)
               System.out.println("Sublista: " + j);
        }
        
        //*********************************************************
        
        //For-each
        String[] cars = {"Volvo","BMW","Tesla","Mazda"};
        for(String Fuchibol : cars){
            System.out.println(Fuchibol);
        }
        
        //**********************************************************
        
        //Break
        for(int y = 0; y < 10;y++){
            if(y==4){
                break;
            }
            System.out.println("XD");
        }
        
        //Continue
        for(int c = 0; c < 10;c++){
            if(c==4){
                continue;
            }
            System.out.println(c);
        }
        
        //*********************************************************
        
        //Arrays
        
        int[] myNums = {100,20,30};
        myNums[0] = 90;
        for(int kk : myNums){
            System.out.println(kk);
        }
        System.out.println("La longitud del array es: " + myNums.length);
        //*********************************************************
        
    }
}
