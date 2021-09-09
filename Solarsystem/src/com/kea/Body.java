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

class Star extends Body {

    String name = "";
    int rotateRate;
    int orbitalTime;
    double size;
    double mass;
    int velocity;
    int temperature;
    int planets;
    int moons;

    public Star(String name, int rotateRate, int orbitalTime, double size, double mass, int velocity, int temperature, int planets, int moons) {
        this.name = name;
        this.rotateRate = rotateRate;
        this.orbitalTime = orbitalTime;
        this.size = size;
        this.mass = mass;
        this.velocity = velocity;
        this.temperature = temperature;
        this.planets = planets;
        this.moons = moons;
    }

    public void all(){
        System.out.println("\n" + name);
        rotateRate();
        orbitalTime();
        size();
        mass();
        velocity();
        temperature();
        planets();
        moons();
    }

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
        System.out.println("Temperature: The average temperature of " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " planets orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " moons orbiting it.");
    }

}


    class Planet extends Body {

        String name = "";
        int rotateRate;
        int orbitalTime;
        double size;
        double mass;
        int velocity;
        int temperature;
        int planets;
        int moons;


    public Planet(String name, int rotateRate, int orbitalTime, double size, double mass, int velocity, int temperature, int planets, int moons) {
        this.name = name;
        this.rotateRate = rotateRate;
        this.orbitalTime = orbitalTime;
        this.size = size;
        this.mass = mass;
        this.velocity = velocity;
        this.temperature = temperature;
        this.planets = planets;
        this.moons = moons;
    }


    public void all(){
        System.out.println("\n" + name);
        rotateRate();
        orbitalTime();
        size();
        mass();
        velocity();
        temperature();
        planets();
        moons();
    }


    @Override
    public void rotateRate() {
        System.out.println("Rotation: " + name + " rotates once every " + rotateRate + " days.");
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
        System.out.println("Temperature: The average temperature of " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " planets orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " moons orbiting it.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotateRate() {
        return rotateRate;
    }

    public void setRotateRate(int rotateRate) {
        this.rotateRate = rotateRate;
    }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public void setOrbitalTime(int orbitalTime) {
        this.orbitalTime = orbitalTime;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPlanets() {
        return planets;
    }

    public void setPlanets(int planets) {
        this.planets = planets;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }
}

class Moon extends Body {

    String name = "";
    int rotateRate;
    int orbitalTime;
    double size;
    double mass;
    int velocity;
    int temperature;
    int planets;
    int moons;


    public Moon(String name, int rotateRate, int orbitalTime, double size, double mass, int velocity, int temperature, int planets, int moons) {
        this.name = name;
        this.rotateRate = rotateRate;
        this.orbitalTime = orbitalTime;
        this.size = size;
        this.mass = mass;
        this.velocity = velocity;
        this.temperature = temperature;
        this.planets = planets;
        this.moons = moons;
    }


    public void all() {
        System.out.println("\n" + name);
        rotateRate();
        orbitalTime();
        size();
        mass();
        velocity();
        temperature();
        planets();
        moons();
    }


    @Override
    public void rotateRate() {
        System.out.println("Rotation: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size() {
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
        System.out.println("Temperature: The average temperature of " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " planets orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " moons orbiting it.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotateRate() {
        return rotateRate;
    }

    public void setRotateRate(int rotateRate) {
        this.rotateRate = rotateRate;
    }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public void setOrbitalTime(int orbitalTime) {
        this.orbitalTime = orbitalTime;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPlanets() {
        return planets;
    }

    public void setPlanets(int planets) {
        this.planets = planets;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }
}

class Satellite extends Body {

    String name = "";
    int rotateRate;
    int orbitalTime;
    double size;
    double mass;
    int velocity;
    int temperature;
    int planets;
    int moons;


    public Satellite(String name, int rotateRate, int orbitalTime, double size, double mass, int velocity, int temperature, int planets, int moons) {
        this.name = name;
        this.rotateRate = rotateRate;
        this.orbitalTime = orbitalTime;
        this.size = size;
        this.mass = mass;
        this.velocity = velocity;
        this.temperature = temperature;
        this.planets = planets;
        this.moons = moons;
    }


    public void all() {
        System.out.println("\n" + name);
        rotateRate();
        orbitalTime();
        size();
        mass();
        velocity();
        temperature();
        planets();
        moons();
    }


    @Override
    public void rotateRate() {
        System.out.println("Rotation: " + name + " rotates once every " + rotateRate + " days.");
    }

    @Override
    public void orbitalTime() {
        System.out.println("Orbit: " + name + " orbits the Sun every " + orbitalTime + " days.");
    }

    @Override
    public void size() {
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
        System.out.println("Temperature: The average temperature of " + name + " is " + temperature + "Kº.");
    }

    @Override
    public void planets() {
        System.out.println("Planets orbiting: " + name + " has " + planets + " planets orbiting it.");
    }

    @Override
    public void moons() {
        System.out.println("Moons orbiting: " + name + " has " + moons + " moons orbiting it.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotateRate() {
        return rotateRate;
    }

    public void setRotateRate(int rotateRate) {
        this.rotateRate = rotateRate;
    }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public void setOrbitalTime(int orbitalTime) {
        this.orbitalTime = orbitalTime;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPlanets() {
        return planets;
    }

    public void setPlanets(int planets) {
        this.planets = planets;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }
}
