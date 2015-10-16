/*
 * Tests the WaterResource Class
 */
package testwaterresource;

/**
 * Michael Feuerstein for project: GrowThePlant
 * 10/15/15
 */
public class TestWaterResource {


    public static void main(String[] args) {
        
        WaterResource resource1, resource2, resource3;
        
        resource1 = new WaterResource();
        resource2 = new WaterResource(10);
        resource3 = new WaterResource(-10);
        
        WaterResource resources[] = {resource1, resource2, resource3};
        
        // check contents of water resources
        System.out.println("Resource1 has " + resource1.toString());
        System.out.println("Resource2 has " + resource2.toString());
        System.out.println("Resource3 has " + resource3.toString());
        
        System.out.println("\nResource Array has:" );
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Index " + (i + 1) + " has:" + resources[i].toString());
        }
        
        // edit resources
        resource1.setWater(4);
        resource2.addWater(-4);
        resource3.addWater(5);
        
        resources[0].addWater(2);
        
                // check contents of water resources
        System.out.println("\n--------- Post Edits---------------------");
        System.out.println("\nResource1 has " + resource1.toString());
        System.out.println("Resource2 has " + resource2.toString());
        System.out.println("Resource3 has " + resource3.toString());
        
        System.out.println("\nResource Array has:" );
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Index " + (i + 1) + " has:" + resources[i].toString());
        }       
    }  
}
