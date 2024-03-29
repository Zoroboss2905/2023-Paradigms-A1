// Class: MyPolygons
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023
// Last Modified: 21/7/2023


public class MyPolygons {
    
    // MyPolygons is a Circular Doubly Linked List (with sentinel Node) that consists of Nodes, each containing data representative of a polygon
    // Variables
    private Node sentinel = new Node(null, null, null);
    private Node current;
    private int size;
    
    // Constructor
    MyPolygons(){
        setSize(0);
        sentinel.setNext(sentinel);
        sentinel.setPrev(sentinel);
    }

    // Getters & Setters

    public int getSize(){
        return size;
    }
    public void setSize(int newSize){
        size = newSize;
    }


    // Methods

    // Add item to the beginning of the list (before the first, after the sentinel)
    public void prepend(Polygon newPoly){
        Node tempNode = new Node(null, newPoly, null);
        tempNode.setPrev(sentinel);
        tempNode.setNext(sentinel.getNext());
        sentinel.getNext().setPrev(tempNode);
        sentinel.setNext(tempNode);
        size++;
    }

    // Add item to the end of the list (before sentienl, after last)
    public void append(Polygon newPoly){
        Node tempNode = new Node(null, newPoly, null);
        tempNode.setPrev(sentinel.getPrev());
        tempNode.setNext(sentinel);
        sentinel.getPrev().setNext(tempNode);
        sentinel.setPrev(tempNode);
        size++;
    }

    // Move the 'current' to the next Node
    public void next(){
        current = current.getNext();
    }

    // Move the 'current' to the sentinel.
    public void reset(){
        current = sentinel;
    }

    // removes an item from the head of the list, return the data contained in the Node
    public Polygon remove(){
        Node tempNode = new Node(null, null, null);
        // set current to polygon we want to remove
        current = sentinel.getNext();
        // Steal polygon to return
        tempNode.setPoly(current.getPoly());
        // connect the surrounding nodes to each other, so we can remove the marked node
        current.getNext().setPrev(sentinel);
        sentinel.setNext(current.getNext());
        // remove all internal pointers in removed node
        current.setNext(null);
        current.setPrev(null);
        // return polygon
        reset();
        size--;
        return tempNode.getPoly();
    }

    // Insert a new (Parsed) Polygon before the location of the 'current' Node
    public void insert(Polygon newPoly){
        Node tempNode = new Node(null, newPoly, null);
        current.getPrev().setNext(tempNode);
        tempNode.setPrev(current.getPrev());
        tempNode.setNext(current);
        current.setPrev(tempNode);
        size++;
    }

    // Finds the location that the new Polygon should sit in the list, then calls on insert() to place it in the list.
    public void insertInOrder(Polygon newPoly){
        reset();
        if(size==0){
            insert(newPoly);
        }else{
            // check entire list, find where it needs to go
            // if it does not find a spot where it fits, and the next node is the sentinel, then append it to the list.
            reset();
            next();
            for(int i=0; i<size; i++){
                if (current.getPoly().ComesBefore(newPoly) == true){
                    insert(newPoly);
                    break;
                } else if(current.getNext() == sentinel){
                    append(newPoly);
                    break;
                } else {
                    next();
                }
            }
        }
    }

    // outputs a string of text detailing the entirity of the list, and each of its polygons, with each of their points.
    public String toString(){
        String output = "";
        reset();
        next();
        for(int i = 0; i < size; i++){
            output = output + current.getPoly().toString() + "\n";
            next();
        }
        return output;
    }
}