// Source: OpenDSA Data Structures and Algorithms Modules Collection, CHAPTER 9 LINEAR STRUCTURES: https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/QueueLinked.html

// Linked queue implementation
class LQueue<E> implements Queue<E> {
    private Link<E> front; // Pointer to front queue node
    private Link<E> rear;  // Pointer to rear queue node
    private int size;      // Number of elements in queue

    // Constructors
    LQueue() { init(); }
    LQueue(int size) { init(); } // Ignore size

    // Initialize queue
    void init() {
        front = rear = new Link<E>(null);
        size = 0;
    }

    // Put element on rear
    public boolean enqueue(E it) {
        rear.setNext(new Link<E>(it, null));
        rear = rear.next();
        size++;
        return true;
    }

    // Remove and return element from front
    public E dequeue() {
        if (size == 0) { return null; }
        E it = front.next().element(); // Store the value
        front.setNext(front.next().next()); // Advance front
        if (front.next() == null) { rear = front; } // Last element
        size--;
        return it; // Return element
    }

    // Return front element
    public E frontValue() {
        if (size == 0) { return null; }
        return front.next().element();
    }

    // Return queue size
    public int length() { return size; }

    //Tell if the queue is empty or not
    public boolean isEmpty() { return size == 0; }


    /* Dr. Carroll added */
    // Reinitialize queue
    public void clear(){
        // reuse header link node
        rear = front;
        size = 0;
    }
    
    public String toString(){
        StringBuffer output2 = new StringBuffer();
        Link<E> temp = front;
        temp = temp.next();
        
        System.out.println("LQueue (" + size + " elements)");
        output2.append("Front");
        for (int i=0; i<=size-1; i++){
            /*if (i==size) {
                i=0;
            }*/
            output2.append(" -> ");
            output2.append(temp.element());
            temp = temp.next();
        }
        output2.append(" <- Rear");
        
        return output2.toString();
    }
}