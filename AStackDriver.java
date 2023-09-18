import java.util.Scanner;

/**
 * Write a description of class AStackDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AStackDriver
{
    public static void main(String args[]){
        
        //request max size
        //perform following operations and display a representation of the stack after each operation
        
        //request max size of new stack
        //perform following
        int size = 0;
        Scanner answer = new Scanner(System.in);
        AStack list;
        AStack list2;
    
        System.out.println("Please enter the maximum size for the first stack: ");
        size = answer.nextInt();
        System.out.println("You entered "+ size);
        list = new AStack(size);
        list.push(1);
        System.out.println(list.toString());
        list.push(2);
        System.out.println(list.toString());
        list.pop();
        System.out.println(list.toString());
        list.push(3);
        System.out.println(list.toString());
        list.pop();
        System.out.println(list.toString());
        list.pop();
        System.out.println(list.toString());
        
        System.out.println("Please enter the maximum size for the second stack: ");
        size = answer.nextInt();
        System.out.println("You entered "+ size);
        list2 = new AStack(size);
        list2.push('s');
        System.out.println(list2.toString());
        list2.push('t');
        System.out.println(list2.toString());
        list2.push('r');
        System.out.println(list2.toString());
        list2.push('e');
        System.out.println(list2.toString());
        list2.push('s');
        System.out.println(list2.toString());
        list2.push('s');
        System.out.println(list2.toString());
        list2.push('e');
        System.out.println(list2.toString());
        list2.push('d');
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
        list2.pop();
        System.out.println(list2.toString());
    }
}
