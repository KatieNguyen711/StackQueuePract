
/**
 * Write a description of class LQueueDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LQueueDriver
{
    public static void main(String args[]){
        
        LQueue list = new LQueue();
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
        
        
        LQueue list2 = new LQueue();
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
