// Source: OpenDSA Data Structures and Algorithms Modules Collection, CHAPTER 9 LINEAR STRUCTURES: https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/StackArray.html
import java.lang.StringBuffer;


class AStack<E> implements Stack<E> {
    private E stackArray[];         // Array holding stack
    private static final int DEFAULT_SIZE = 10;
    private int maxSize;            // Maximum size of stack
    private int top;                //First free position at top

    // Constructors
    @SuppressWarnings("unchecked") // Generic array allocation
        AStack(int size) {
        maxSize = size;
        top = 0;
        stackArray = (E[])new Object[size]; // Create stackArray
    }
    AStack() { this(DEFAULT_SIZE); }

    public void clear() { top = 0; }    // Reinitialize stack

    // Push "it" onto stack
    public boolean push(E it) {
        if (top >= maxSize) { return false; }
        stackArray[top++] = it;
        return true;
    }

    // Remove and return top element
    public E pop() {
        if (top == 0) { return null; }
        return stackArray[--top];
    }

    public E topValue() {          // Return top element
        if (top == 0) { return null; }
        return stackArray[top-1];
    }

    public int length() { return top; } // Return stack size

    public boolean isEmpty() { return top == 0; }  // Tell if the stack is empty
    
    public String toString(){
        StringBuffer output = new StringBuffer();
        StringBuffer output2 = new StringBuffer();
        
        System.out.println("AStack (" + top + " elements):");
        
        //first line
        for(int i = 0; i<top; i++){
            if(i==0){
                output.append(i);
            }else{
                output.append("\t");
                output.append(i);
            }
        }
        if(top!=0){
            output.append("\t");
        }
        output.append("Index");
        
        //second line
        for(int i = 0; i<top; i++){
            if(i==0){
                output2.append(stackArray[i]);
            }else{
                output2.append("\t");
                output2.append(stackArray[i]);
            }
        }
        if(top!=0){
            output2.append("\t");
        }
        output2.append("Top");
        
        return output.toString() + "\n" + output2.toString();
    }
}