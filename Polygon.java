// Class: Polygon
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023
// Last Modified: 21/7/2023



public class Polygon implements ComparePoly{

    // Private Variables
    private Point[] points;
    
    // Constructors
    public Polygon(){}

    public Polygon(Point[] newPoints){
        points = newPoints;
    }

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
        double totalArea = 0;
        double area = 0;
        for(int i = 0; i < points.length-1; i++){
            area = area + (points[i+1].getX()+points[i].getX())*(points[i+1].getY()-points[i].getY());
        }
        totalArea = Math.abs(area)/2;
        return totalArea;
    }

    // Outputs a String that contains infor on each coordinate of each point, in addition to the Polygon's Area
    public String toString(){
        String output = "[";
        // For each point, add the point's coordinates to the String
        for(int i=0; i<points.length-1; i++){
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
        double max = Math.max(this.area(), o.area());
        // if the difference is miniscule, check distance instead
        if(Math.abs(difference) < max*0.001 ){
            if (this.dist() < o.dist()){
                // 'this' is closer, thus is first
                return false;
            }   else {
                // 'o' is closer, thus is first
                return true;
            }
        }
        // if difference is larger than 0.1% then check area 
        else{
            if(this.area() < o.area()){
                // 'o' is larger, thus is after 'this'
                return false;
            } else{
                // 'this' is larger, thus is after 'o'
                return true;
            }
        }
    }
}