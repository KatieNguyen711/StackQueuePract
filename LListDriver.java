import java.util.Scanner;

/**
 * Write a description of class LListDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LListDriver
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String fName = "";
        String mName = "";
        String lName = "";
        Character letter;
        
        LList list = new LList();
        StringBuffer output = new StringBuffer();
        
        //prompt user for first name; insert every character
        System.out.println("Please enter your first name: ");
        fName = input.nextLine();
        System.out.println("You entered " + fName);
        for(int i =0; i<fName.length(); i++){
            list.append(fName.charAt(i));
        }
        System.out.println("Just the first name: " + list.toString());
        
        //prompt user for lastname; insert every character
        System.out.println("Please enter your last name: ");
        lName = input.nextLine();
        System.out.println("You entered " + lName);
        list.append(" ");
        for(int i =0; i<lName.length(); i++){
            list.append(lName.charAt(i));
        }
        System.out.println("With first and last names: " + list.toString());
        
        //prompt middle initial, add "."
        System.out.println("Please enter just your middle initial: ");
        mName= input.nextLine();
        System.out.println("You entered " + mName);
        list.moveToPos(fName.length() + 1);
        list.insert(" ");
        list.insert(".");
        list.insert(mName);
        System.out.println("Full name: " + list.toString());
        
        
        //Remove all but the first letter of their names
        list.moveToStart();
        for(int i = 0; i<list.length(); i++){
            if(list.getValue().equals(fName.charAt(0))){
                list.next();
            }else if(list.getValue().equals(mName)){
                list.next();
            }else if(list.getValue().equals(lName.charAt(0))){
                list.next();
            }else{
                list.remove();
            }
        }
        list.moveToPos(3);
        for(int i = 0; i<lName.length()-1; i++){
            if(list.getValue().equals(lName.charAt(0))){
                list.next();
            }else{
                list.remove();
            }
        }
        System.out.println("Just initials: " + list.toString());
    }  
}
