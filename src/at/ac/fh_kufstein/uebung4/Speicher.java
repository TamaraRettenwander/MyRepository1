
package at.ac.fh_kufstein.uebung4;


public class Speicher
{
    public static void main(String[] args)
    {
    Liste a = new Liste(3);
    a.save(2.0);
    a.save(5.0);
    a.save(200.0);
    
    
           System.out.println(a.toString());
      
    }
   
}
