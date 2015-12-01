/**
 * Represents a pet animal.
 * @author johns6971
 */
public abstract class Pet {
    private String name;
    private int age;
    private String gender;
    
    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    /**
     * Asks the pet to speak.
     */
    public abstract void speak();
    
    /**
     * asks the pet to move.
     */
    public abstract void move();
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getGender() {
        return this.gender;
    }
}
