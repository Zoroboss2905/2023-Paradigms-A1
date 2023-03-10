// Class: MyPolygons
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023


public class MyPolygons {
    
    // MyPolygons is a Circular Doubly Linked List (with sentinel Node) that consists of Nodes, each containing data representative of a polygon
    // Variables
    private Node sentinel;
    private Node current;
    private int size;
    
    // Constructor
    MyPolygons(){
        setSize(0);
    }

    // Getters & Setters

    public int getSize(){
        return size;
    }
    public void setSize(int newSize){
        size = newSize;
    }


    // Methods

    public void insert(){

    }

    public void remove(){

    }

    public void insertInOrder(Polygon newPoly){
        for(int i=0; i<this.getSize(); i++){
            current.getPoly().ComesBefore(newPoly);
        }

    }



}
