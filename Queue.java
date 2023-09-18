// Source: OpenDSA Data Structures and Algorithms Modules Collection, CHAPTER 9 LINEAR STRUCTURES: https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/Queue.html

public interface Queue<E> { // Queue class ADT
    // Reinitialize queue
    public void clear();

    // Put element on rear
    public boolean enqueue(E it);

    // Remove and return element from front
    public E dequeue();

    // Return front element
    public E frontValue();

    // Return queue size
    public int length();

    //Tell if the queue is empty or not
    public boolean isEmpty();
}