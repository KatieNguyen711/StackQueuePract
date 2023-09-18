
/**
 * Write a description of class LStackDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LStackDriver
{
    public static void main(String args[]){
        LStack list = new LStack();
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
        
        LStack list2 = new LStack();
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
