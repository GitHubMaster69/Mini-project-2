package main;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;
import processing.data.Table;
import processing.data.TableRow;



public class Google extends PApplet {

    float angle;

    Table table;

    PImage earth;

    public void settings() {
        size(600, 600, P3D);
        earth = loadImage("earth.jpg");
    }
    public static void main(String[] args){
        PApplet.main("Main.Main");
    }

}