package com.kea;

abstract class Body {

    public abstract void rotateRate();
    public abstract void orbitalTime();
    public abstract void size();
    public abstract void mass();
    public abstract void velocity();
    public abstract void temperature();
    public abstract void planets();
    public abstract void moons();

}

class Sun extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;

    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Mercury extends Body {

    String name = "Mercury";
    int rotateRate = 0;
    double orbitalTime = 88;
    double size = 0.147;
    double mass = 0.056;
    int velocity = 47;
    int temperature = 387;
    int planets = 0;
    int moons = 0;

    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Venus extends Body {

    String name = "Venus";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Earth extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Mars extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Jupiter extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Saturn extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Uranus extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}

class Neptune extends Body {

    String name = "The Sun";
    int rotateRate = 27;
    int orbitalTime = 0;
    double size = 1300000;
    double mass = 333000;
    int velocity = 220;
    int temperature = 5772;
    int planets = 8;
    int moons = 0;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times bigger than Earth.");
    }

    @Override
    public void mass() {
        System.out.println("Mass: " + name + " is " + mass + " times Earths mass.");
    }

    @Override
    public void velocity() {
        System.out.println("Velocity: " + name + " is traveling with " + velocity + "km/s.");
    }

    @Override
    public void temperature() {
        System.out.println("Temperature: " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " orbiting it.");
    }

}
