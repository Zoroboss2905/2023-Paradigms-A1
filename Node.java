// Class: Node
// Author: Jarrod Aubin
// Subject: SENG2200 Programming Languages and Paradigms
// Assignment 1
// 03/03/2023


public class Node {
    
    // Private variables
    private Node prev;
    private Polygon poly;
    private Node next;

    // Constructors
    public Node(){
        prev = null;
        poly = null;
        next = null;
    }

    public Node(Node newPrev, Polygon newPoly, Node newNext){
        prev = newPrev;
        poly = newPoly;
        next = newNext;
    }

    // Getters & Setters
    public Node getPrev(){
        return prev;
    }
    public Polygon getPoly(){
        return poly;
    }
    public Node getNext(){
        return next;
    }

    public void setPrev(Node newPrev){
        prev = newPrev;
    }
    public void setPoly(Polygon newPoly){
        poly = newPoly;
    }
    public void setNext(Node newNext){
        next = newNext;
    }

    // Methods
}
