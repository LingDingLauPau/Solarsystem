package com.kea;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Star sun = new Star("The Sun", 27,0,
                1300000,333000,220,5772,8,0);
        Planet mercury = new Planet("Mercury", 0,88,
                0.147,0.056,47,387,0,0);

        Planet venus = new Planet("Venus", -117,225,
                0.949,0.815,35,737,0,0);

        Planet earth = new Planet("Earth", 24,365,
                1,1,30,290,0,1);

        Planet mars = new Planet("Mars", 25,687,
                0.533,0.107,24,210,0,2);

        Planet jupiter = new Planet("Jupiter", 10,4332,
                11.209,317.812,13,116,0,79);

        Planet saturn = new Planet("Saturn", 10,10759,
                763.599,95.159,10,134,0,82);

        Planet uranus = new Planet("Uranus", -17,30688,
                63.086,14.536,7,76,0,27);

        Planet neptune = new Planet("Neptune", 16,60195,
                57.741,5.155,5,72,0,14);

        sun.all();
        mercury.all();
        venus.all();
        earth.all();
        mars.all();
        jupiter.all();
        saturn.all();
        uranus.all();
        neptune.all();


    }
}
