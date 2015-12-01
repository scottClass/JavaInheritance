/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class AnimalTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog bob = new Dog("Bob", 5, "male");     
        Cat fluffy = new Cat("Fluffy", 3, "female", 9);
        
        Pet[] animals = new Pet[2];
        
        animals[0] = bob;
        animals[1] = fluffy;
        
        
        
        for(int i = 0; i < animals.length; i ++) {
            animals[i].speak();
            //checks to see if it found a dog
            if(animals[i] instanceof Dog) {
                Dog d = (Dog)animals[i];
                d.howl();
                System.out.println(d);
            }
        }
    }
}
