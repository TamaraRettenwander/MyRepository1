
package at.ac.fh_kufstein.uebung5;

import at.ac.fh_kufstein.uebung_03.Classes.Color;


public class Speicher
{
    public static void main(String[] args)
    {
    Liste<Aufgabe3> b = new Liste(2); //Vehicle: Boat und Car erben
    
    Car c = new Car((short)4,Color.black,(short) 180,(short) 5 ,(short) 8);
    Boat d = new Boat((short)0, Color.blue, (short)51000, (short) 0, 10.54, (short) 3, 100.000);
    Vehicle e = new Vehicle((short) 42, Color.grey, (short) 200, (short) 3);


//    Car a = new Car();
//    
//    b.save(a);
////    
    b.save(c);
    b.save(d);
    b.save(e);
    
           
        System.out.println(b.toString());
       
           


    }
   
}
