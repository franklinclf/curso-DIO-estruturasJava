package com.estruturas;

public class Stack<T>{
    private Node<T> refNode;

    public Stack() {
        this.refNode = null;
    }

    public void push(T content) {
        Node<T> oldNode = this.refNode;
        this.refNode = new Node<>(content);
        this.refNode.setNext(oldNode);
    }

    public Node<T> pop() {
        if(!this.isEmpty()) {
            Node<T> poppedNode = this.refNode;
            this.refNode = this.refNode.getNext();
            return poppedNode;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.refNode == null;
    }

    @Override
    public String toString() {
        Node<T> auxNode = this.refNode;
        StringBuilder result = new StringBuilder();
        while(auxNode != null) {
            result.append(auxNode.getContent()).append(" ");
            auxNode = auxNode.getNext();
        }
        return result.toString();
    }
}
