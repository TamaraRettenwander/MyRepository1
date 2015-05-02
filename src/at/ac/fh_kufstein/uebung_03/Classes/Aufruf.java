
package at.ac.fh_kufstein.uebung_03.Classes;


public class Aufruf{


    public static void main(String[] args)
    {
      Car bmw = new Car((short)4,Color.silver,(short) 220,(short) 5 ,(short) 4);
      Car audi = new Car((short)4,Color.black,(short) 180,(short) 5 ,(short) 8);
       
      Boat titanic = new Boat((short)0, Color.blue, (short)51000, (short) 0, 10.54, (short) 3, 100.000);
              
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);   
    
        //Aufgabe2 Benennbar
        
//     Benennbar namedCar = new Car();
//     namedCar.setName("Volkswagen");
//     System.out.println("Das neue Auto heißt " + namedCar.getName());
             
       // Aufgabe3 abstrakte Klasse
        
        Aufgabe3 namedCar = new Car();
        namedCar.setNamex("Porsche");
        System.out.println("Das neue Auto heißt "+ namedCar.getNamex());
        
    }
       
    }
    

