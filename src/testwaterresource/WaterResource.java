/*
     UML Diagram
     -----------
     Class Name: WaterResource
     --------------------
     Class Variables :
     -numWater: int
     ---------------
     Class Methods :
     +WaterResource()
     +WaterResource(int)
     +setWater(int): void
     +getWater(): int
     +addWater(int): void
     +toString(): String
*/

package testwaterresource;

public class WaterResource {
    
    private int numWater;
    
    public WaterResource()
    {
        numWater = 0;
    }
    
    public WaterResource(int numResource)
    {
        numWater = (numResource <= 0? 0: numResource);
    } 
    
    public void setWater(int numResource)
    {
        numWater = (numResource <= 0? 0: numResource);
    }
    
    public int getWater()
    {
        return numWater;
    }
    
    public void addWater(int numResource)
    {
        setWater(numWater + numResource);
    }
    
    @Override
    public String toString()
    {
        return "" + numWater + " water";
    }
}
