// Source: OpenDSA Data Structures and Algorithms Modules Collection, CHAPTER 9 LINEAR STRUCTURES: https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/StackArray.html

public interface Stack<E> { // Stack class ADT
    // Reinitialize the stack.
    public void clear();

    // Push "it" onto the top of the stack
    public boolean push(E it);

    // Remove and return the element at the top of the stack
    public E pop();

    // Return a copy of the top element
    public E topValue();

    // Return the number of elements in the stack
    public int length();

    // Tell if the stack is empty or not
    public boolean isEmpty();
}
