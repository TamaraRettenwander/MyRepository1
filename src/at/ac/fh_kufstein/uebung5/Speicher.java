
package at.ac.fh_kufstein.uebung5;

import at.ac.fh_kufstein.uebung_03.Classes.Color;


public class Speicher
{
    public static void main(String[] args)
    {
    Liste<Aufgabe3> b = new Liste(3);
    
    Aufgabe3 c = new Car((short)4,Color.black,(short) 180,(short) 5 ,(short) 8);
    Aufgabe3 d = new Boat((short)0, Color.blue, (short)51000, (short) 0, 10.54, (short) 3, 100.000);
    Aufgabe3 e = new Vehicle((short) 4, Color.grey, (short) 200, (short) 3);

//    if (b.equals("Car") || (b.equals("Boat") || (b.equals("Vehicle"))))
//    {
//        System.out.println(b.toString());
//    }
//    else 
//    {
//        System.err.println("Kein Objekt vom Typ Vehicle, Car oder Boat");
//    }
     
    b.save(c);
    b.save(d);
    b.save(e);
           
        System.out.println(b.toString());
           


    }
   
}
