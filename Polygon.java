// Class: Polygon
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023


public class Polygon{

    // Private Variables
    private Point[] points;
    
    // Constructors
    public Polygon(){}

    public Polygon(Point[] newPoints){
        points = newPoints;
    }


    // Getters & Setters



    // Methods    
    // Find the Point that is the closest to the origin, return the distance of that point.
    public double dist(){
        double distance = points[0].dist();
        // for each point, compare distance with another point.
        for(int i=0; i<points.length; i++){
            double newDist = points[i].dist();
            // if the new one has a smaller distance, overwrite the old distance.
            if(newDist<distance){
                distance = newDist;
            }
        }
        return distance;
    }

    // Find the Area of the polygon.
    public double area(){
        double area = 0;



        return area;
    }

    // Outputs a String that contains infor on each coordinate of each point, in addition to the Polygon's Area
    public String toString(){
        return "";
    }

}