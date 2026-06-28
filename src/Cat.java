// CAT CLASS - This is the BLUEPRINT
public class Cat {
    String name;
    
    // Constructor - creates a cat with a name
    public Cat(String name) {
        this.name = name;
    }
    
    // Method - what Cats can do
    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}