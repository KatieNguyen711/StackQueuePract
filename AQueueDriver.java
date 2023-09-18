import java.util.Scanner;

/**
 * Write a description of class AQueueDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AQueueDriver
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int size = 0;
        AQueue list;
        
        
        System.out.println("Please enter the maximum size for the first queue: ");
        size = input.nextInt();
        System.out.println("You entered " + size);
        list = new AQueue(size);
        list.enqueue( 1 );
        System.out.println(list.toString());
        list.enqueue( 2 );
        System.out.println(list.toString());
        list.dequeue( );
        System.out.println(list.toString());
        list.enqueue( 3 );
        System.out.println(list.toString());
        list.dequeue( );
        System.out.println(list.toString());
        list.dequeue( );
        System.out.println(list.toString());
            
        System.out.println("Please enter the maximum size for the second queue: ");
        size = input.nextInt();
        System.out.println("You entered " + size);
        AQueue list2 = new AQueue(size);
        list2.enqueue( 's' );
        System.out.println(list2.toString());
        list2.enqueue( 't' );
        System.out.println(list2.toString());
        list2.enqueue( 'r' );
        System.out.println(list2.toString());
        list2.enqueue( 'e' );
        System.out.println(list2.toString());
        list2.enqueue( 's' );
        System.out.println(list2.toString());
        list2.enqueue( 's' );
        System.out.println(list2.toString());
        list2.enqueue( 'e' );
        System.out.println(list2.toString());
        list2.enqueue( 'd' );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.enqueue( '!' );
        System.out.println(list2.toString());
        list2.enqueue( '?' );
        System.out.println(list2.toString());
        list2.enqueue( '@' );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        list2.dequeue( );
        System.out.println(list2.toString());
        
    }
}
