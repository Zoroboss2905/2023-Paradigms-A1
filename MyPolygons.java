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

    public void insert(Polygon newPoly){
        // put it at the end of the list, meaning:
        // set new node prev to sentinel.prev, set sentinel.prev.next to new node, set new node.next to sentinel set sentinel.prev to new node. done
        // basically an append, but this is the default insert
    }

    public void remove(){

    }

    public void insertInOrder(Polygon newPoly){
        current = sentinel.getNext();
        for(int i=0; i<this.getSize(); i++){
            if(current.getPoly().ComesBefore(newPoly)){
                current = current.getNext();
            } else{
                // This new polygon has to go into a node that fits before 'current'
            }
        }

    }

    public String toString(){
        String output = "";
        // TODO
        return output;
    }
}
