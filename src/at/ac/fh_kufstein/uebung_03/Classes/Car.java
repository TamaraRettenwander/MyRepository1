
package at.ac.fh_kufstein.uebung_03.Classes;


public class Car extends Vehicle
{
    
    private boolean aircondition;
    private short airbag;
    
    public Car(short wheels, Color color, short ps, short doors, short airbag)
    {
       super(wheels, color, ps, doors);
       this.aircondition = false;
       this.airbag = airbag;
       
      }
    
    public Car()
    {
        super();
    }
         
  public void startAircondition(boolean aircondition)
{
    if (aircondition = false)
    {
        aircondition = true;
    }
    else
    { 
        System.out.println("The aircondition is already running!");
    }
}   

 public void stopAircondition(boolean aircondition)
 {
         if (aircondition = true)
    {
        aircondition = false;
    }
    else
    { 
        System.out.println("The aircondition is already stopped!");
    }
 }   

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    
 @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " PS und einen fährt " + getSpeed()+ "km/h";
    }
 
}
