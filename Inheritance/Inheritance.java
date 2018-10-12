public class Inheritance {
    public static void main(String[] args) {
        //Ex17
        Cat fibi = new Cat("Fibi", 11, "brown");
        fibi.sayName();

        Dog rex = new Dog("Rex", 5, "grey");
        rex.sayName();

        Spider ron = new Spider("Ron", 67);
        ron.sayName();
        System.out.println(ron.getLegs());

        Fly miso = new Fly("Miso", 44);
        miso.sayName();
    }
}

abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public abstract void sayName();
    public abstract int getLegs();
}

abstract class Mammal extends Animal {
    private String furColor;

    Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
}

class Cat extends Mammal {
    Cat(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    public void sayName() {
        System.out.println("Meow! my name is " + this.getName());
    }

    public int getLegs() {
        return 4;
    }
}

class Dog extends Mammal {
    Dog(String name, int age, String furColor) {
        super(name, age, furColor);
    }

    public void sayName() {
        System.out.println("Woof! I'm called " + this.getName());
    }

    public int getLegs() {
        return 4;
    }
}

class Spider extends Animal {
    Spider(String name, int age) {
        super(name, age);
    }

    public void sayName() {
        System.out.println("Mate I'm don man " + this.getName());
    }

    public int getLegs() {
        return 8;
    }
}

class Fly extends Animal {
    Fly(String name, int age) {
        super(name, age);
    }

    public void sayName() {
        System.out.println("Geezer, they call me " + this.getName());
    }

    public int getLegs() {
        return 6;
    }
}