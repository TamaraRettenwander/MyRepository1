

package at.ac.fh_kufstein.uebung_03.Classes;


public class Vehicle extends Aufgabe3
//implements Benennbar
{
    private short wheels;
    private Color color;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    protected String name;

//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String _n) {
//        name = _n;
//    }
//             
        public Vehicle(short wheels, Color color, short ps, short doors) {
        this.wheels = wheels;
        this.color = color;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
    
    }
        
        public Vehicle()
        {
            super();
        }
    
    
       public static void start(boolean started)
    {
        started = true;
    }
    
        public static void stop(boolean stopped)
    {
        stopped = false;
    }
    
    public  void accelerate(short speed)
    {
        if (started = true)
        {
           
                    if ( this.speed + speed <= 250)
                    {
                        this.speed += speed;
                    }
                    else 
                    {
                        this.speed = 250;
                    }
        }
    }
    
    public void breaking(short speed)
    {
      if (started = true)
        {
           
                    if ( this.speed + speed >= 0)
                    {
                        this.speed -= speed;
                    }
                    else 
                    {
                        this.speed = 0;
                    }
        }
        }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    
    
    
    
    
}
