# Difference-Objects-Classes

## Project Description
This project demonstrates the fundamental differences between **classes** and **objects** in Java through a simple Cat example.

## Concepts Demonstrated

### Class vs Object

**CLASS (Cat):**
- A blueprint or template for creating objects
- Defines what properties (attributes) objects will have
- Defines what methods (behaviors) objects can perform
- Exists only in code—no actual data
- Defined once, but can create many objects from it

**OBJECTS (whiskers, fluffy, mitten):**
- Actual instances created from the class blueprint
- Each object has its own independent data
- Multiple objects can be created from one class
- Each object takes up memory with real values
- All objects share the same methods but act independently

## Files Included

- **Cat.java** - The Cat class (blueprint)
- **Main.java** - Demonstrates creating 3 objects from the Cat class

## Source Code

### Cat.java
```java
// CAT CLASS - This is the BLUEPRINT
public class Cat {
    String name;
    
    // Constructor - creates a cat with a name
    public Cat(String name) {
        this.name = name;
    }
    
    // Method - what cats can do
    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
```

### Main.java
```java
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
```

## Program Output