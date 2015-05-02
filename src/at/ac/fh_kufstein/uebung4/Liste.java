
package at.ac.fh_kufstein.uebung4;


public class Liste<T> 
{
    private T[] array;
    
    
        public Liste (int size) //Größe des Arrays als Parameter
        {
            array = (T[]) (new Object[size]);
            
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
            }
        }

    @Override
    public String toString() 
    {String Inhalt = "";
    for (T a : array)
                    
    {
        Inhalt += a + "\n";
    }
    return Inhalt;
    }
}
