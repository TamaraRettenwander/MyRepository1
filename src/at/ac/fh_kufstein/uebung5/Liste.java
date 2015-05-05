
package at.ac.fh_kufstein.uebung5;

import at.ac.fh_kufstein.uebung_03.Classes.Benennbar;


public class Liste<T extends Aufgabe3>
{
    Aufgabe3[] array;
    
    
        public Liste (int size) //Größe des Arrays als Parameter
        {
            array = new Aufgabe3[size];
            
        }
    
        public void save (T wert) //nimmt ein Element auf
        {
            for (int i = 0; i < array.length; i++) 
            {
                if (array[i] == null) // bei freier Stelle
                {
                    array [i] = wert;
                    System.out.println("Ihr Eintrag wurde erfolgreich gespeichert!");
                    break;
                }
                else if (array[array.length-1]!= null) //wenn vorheriges Arrayfeld mit Werten
                {
                    System.err.println("ARRAY VOLL");
                    break;
                }

            }
        }

    @Override
    public String toString() 
    {String Inhalt = "";
    for (Aufgabe3 b : array)
                    
    {
        Inhalt += b + "\n";
    }
    return Inhalt;
    }
}
