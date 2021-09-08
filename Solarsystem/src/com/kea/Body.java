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
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
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
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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
    int rotateRate = -117;
    int orbitalTime = 225;
    double size = 0.949;
    double mass = 0.815;
    int velocity = 35;
    int temperature = 737;
    int planets = 0;
    int moons = 0;


    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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

    String name = "Earth";
    int rotateRate = 24;
    int orbitalTime = 365;
    double size = 1;
    double mass = 1;
    int velocity = 30;
    int temperature = 287;
    int planets = 0;
    int moons = 1;


    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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

    String name = "Mars";
    int rotateRate = 25;
    int orbitalTime = 687;
    double size = 0.533;
    double mass = 0.107;
    int velocity = 24;
    int temperature = 210;
    int planets = 0;
    int moons = 2;


    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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

    String name = "Jupiter";
    int rotateRate = 10;
    int orbitalTime = 4332;
    double size = 11.209;
    double mass = 317.812;
    int velocity = 13;
    int temperature = 116;
    int planets = 0;
    int moons = 79;


    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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

    String name = "Saturn";
    int rotateRate = 10;
    int orbitalTime = 10759;
    double size = 763.599;
    double mass = 95.159;
    int velocity = 10;
    int temperature = 134;
    int planets = 0;
    int moons = 82;


    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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

    String name = "Uranus";
    int rotateRate = -17;
    int orbitalTime = 30688;
    double size = 63.086;
    double mass = 14.536;
    int velocity = 7;
    int temperature = 76;
    int planets = 0;
    int moons = 27;




    @Override
    public void rotateRate() {
        System.out.println("Rotates: " + name + " rotates once every " + rotateRate + " hours.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size(){
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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

    String name = "Neptune";
    int rotateRate = 16;
    int orbitalTime = 60195;
    double size = 57.741;
    double mass = 5.155;
    int velocity = 5;
    int temperature = 72;
    int planets = 0;
    int moons = 14;




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
        System.out.println("Size: " + name + " is " + size + " times Earths size.");
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
