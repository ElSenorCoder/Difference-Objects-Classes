public class Main {
    public static void main(String[] args) {
        
        // CLASS: Cat is just a blueprint
        System.out.println("Cat is a CLASS (blueprint)\n");
        
        // OBJECTS: Create actual cats from the blueprint
        Cat whiskers = new Cat("Whiskers");
        Cat fluffy = new Cat("Fluffy");
        Cat mitten = new Cat("Mitten");
        
        System.out.println("Created 3 OBJECTS from the Cat class:");
        whiskers.meow();
        fluffy.meow();
        mitten.meow();
        
        System.out.println("\nEach object has its own data:");
        System.out.println("whiskers.name = " + whiskers.name);
        System.out.println("fluffy.name = " + fluffy.name);
        System.out.println("mitten.name = " + mitten.name);
    }
}