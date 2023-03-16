// Class: Main
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023


import java.util.Scanner;

public class A1 {
    public static void main(String args[]){

        Scanner inputFile = new Scanner(args[0]);
        while(inputFile.hasNext()){
            // if next letter is P, indicates the start of a polygon
            if(inputFile.next() == "P"){
                // Instantiate a temporary Point array with a length defined by the next integer in the input file.
                Point[] newPoints = new Point[inputFile.nextInt()];
                // For each required point, set the coordinates using the next two DOUBLE values.
                for(int i=0; i < newPoints.length; i++){
                    newPoints[i].setX(inputFile.nextDouble());
                    newPoints[i].setY(inputFile.nextDouble());
                }
                // Create a new Polygon using newPoints

                // Add new polygon to each linkedList (unsorted then sorted)

            }

        }



    }
}
