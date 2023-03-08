// Class: Point 
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023


public class Point{

    // private variables
    private double x;
    private double y;

    // Constructors (blank and filled)
    public Point(){}

    public Point(double newX, double newY){
        x = newX;
        y = newY;
    }

    // Getters & Setters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public void setX(double newX){
        x = newX;
    }
    public void setY(double newY){
        y = newY;
    }

    // Methods
    // Distance formula returns the distance from this point, to the Origin (0, 0)
    public double dist(){
        double distance = Math.sqrt((x*x) + (y*y));
        return distance;
    }

    // Returns information pertaining to each Point's Co-ordinates on a Cartesian Plane. "(0,0)"
    public String toString(){
        String output = "("+String.format("%4.2f",x)+","+String.format("%4.2f",y)+")";
        return output;
    }
}