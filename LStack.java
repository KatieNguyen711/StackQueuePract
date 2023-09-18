// Source: OpenDSA Data Structures and Algorithms Modules Collection, CHAPTER 9 LINEAR STRUCTURES: https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/StackLinked.html

// Linked stack implementation
class LStack<E> implements Stack<E> {
    private Link<E> top;            // Pointer to first element
    private int size;               // Number of elements
    

    // Constructors
    LStack() { top = null; size = 0; }
    LStack(int size) { top = null; size = 0; }

    // Reinitialize stack
    public void clear() { top = null; size = 0; }

    // Put "it" on stack
    public boolean push(E it) {
        top = new Link<E>(it, top);
        size++;
        return true;
    }

    // Remove "it" from stack
    public E pop() {
        if (top == null) { return null; }
        E it = top.element();
        top = top.next();
        size--;
        return it;
    }

    public E topValue() {      // Return top value
        if (top == null) { return null; }
        return top.element();
    }

    // Return stack length
    public int length() { return size; }

    // Tell if the stack is empty
    public boolean isEmpty() { return size == 0; }

    public String toString(){
        StringBuffer output = new StringBuffer();
        Link<E> temp = top;
        
        System.out.println("LStack (" + size + " elements):");
        output.append("Top");
        for(int i=0; i<size; i++){
            output.append("->");
            output.append(temp.element());
            temp = temp.next();
        }
        return output.toString();
    }
}