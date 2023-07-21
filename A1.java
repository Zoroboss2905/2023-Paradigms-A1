// Class: Main
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023
// Last Modified: 21/7/2023

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A1 {
    public static void main(String args[]){

        File file = new File("sample_in.txt");
        try{
            Scanner inputFile = new Scanner(file);

            MyPolygons unsortedList = new MyPolygons(); 
            MyPolygons sortedList = new MyPolygons();

            while(inputFile.hasNext()){
                // if next letter is P, indicates the start of a polygon
                if(inputFile.next().equalsIgnoreCase("P")){
                    // Instantiate a temporary Point array with a length defined by the next integer in the input file.
                    int tempPolySize = inputFile.nextInt();
                    Point[] newPoints = new Point[tempPolySize+1];
                    // For each required point, set the coordinates using the next two DOUBLE values.
                    for(int i=0; i < newPoints.length-1; i++){
                        Point tempPoint = new Point();
                        tempPoint.setX(inputFile.nextDouble());
                        tempPoint.setY(inputFile.nextDouble());
                        newPoints[i] = tempPoint;
                    }
                    newPoints[newPoints.length-1] = new Point(newPoints[0].getX(), newPoints[0].getY());
                    // Create a new Polygon using newPoints
                    Polygon tempPoly = new Polygon(newPoints);
                    // Add new polygon to each linkedList (unsorted then sorted)
                    unsortedList.append(tempPoly);
                    sortedList.insertInOrder(tempPoly);
                }
            }
            inputFile.close();

            // Print out the lists, they should be inserted correctly at this point, if not something has gone wrong
            System.out.println("Unsorted list:\n" + unsortedList.toString());
            System.out.println("Sorted list:\n" + sortedList.toString());

        } catch (IOException FileNotFound){
            System.out.println("File Not Found, please restart Program and try again.");
        }
    }
}