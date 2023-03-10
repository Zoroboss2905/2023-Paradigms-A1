// Class: Polygon
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023


public class Polygon implements ComparePoly{

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
        //TODO carefuly craft an area function based on the formula given to us in the spec


        return area;
    }

    // Outputs a String that contains infor on each coordinate of each point, in addition to the Polygon's Area
    public String toString(){
        String output = "[";
        // For each point, add the point's coordinates to the String
        for(int i=0; i<points.length; i++){
            output = output + points[i].toString();
        }
        // Finally, cap off the points list, and append the area.
        output = output + "]: "+String.format("%6.2f",area());
        return output;
    }


    // Return true of the current polygon is larger than (and should come before) the polygon being checked
    // Return false if the current polyon is smaller than (and should come after) the polygon being checked
    public boolean ComesBefore(Polygon o){
        double difference = this.area() - o.area();

        if (difference < 0){
            // o is bigger, check difference to 0.1% of 'this'
            if(Math.abs(difference) < (this.area()*0.001)){
                //the difference is smaller than 0.1%, find the closer one.
                if(this.dist()<o.dist()){
                    // 'this' is closer to 0,0, therefore goes first
                    return true;
                } else {
                    // o is closer to 0,0, therefore goes first
                    return false;
                }
            } else{
                // the difference is larger than 0.1%, o goes first.
                return false;
            }
        } else if (Math.abs(difference) > 0){
            // this is bigger, check difference to 0.1% of o
            if(difference < (o.area()*0.001)){
                //the difference is smaller than 0.1%, find the closer one.
                if(this.dist()<o.dist()){
                    // 'this' is closer to 0,0, therefore goes first
                    return true;
                } else {
                    // o is closer to 0,0, therefore goes first
                    return false;
                }
            } else{
                // the difference is larger than 0.1%, 'this' goes first.
                return true;
            }
        } else {
            // they are exactly the same size, find which one is closer.
            if(this.dist()<o.dist()){
                // 'this' is closer to 0,0, therefore goes first
                return true;
            } else {
                // o is closer to 0,0, therefore goes first
                return false;
            }
        }
    }

    // Create an Abstract Class that basically makes Polygons into Objects


}