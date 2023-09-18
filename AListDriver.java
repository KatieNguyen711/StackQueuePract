import java.util.Scanner;

/**
 * array-based list
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AListDriver
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String fName = "";
        String mName = "";
        String lName = "";
        
        AList l;
        StringBuffer output = new StringBuffer();
        StringBuffer output2 = new StringBuffer();
        
        System.out.println("Please enter the number of characters for your first name, a space, your middle initial (and a '.'), a space and your last name: ");
        int maxSize= input.nextInt();
        l = new AList(maxSize);
        System.out.println("you entered " + maxSize);
        
        fName = input.nextLine();
        System.out.println("Please enter your first name: ");
        fName = input.nextLine();
        l.insert(fName.charAt(0));
        for (int i=1; i>0 && i<fName.length(); i++){
            l.append(fName.charAt(i));
        }
        l.append(" ");
        System.out.println("you entered " + fName);
        for (int i=l.currPos(); i<l.length(); i++){
            if (l.getValue() != null){
                if (i==0 || i == fName.length()){
                    output.append(l.getValue());
                }else{
                    output.append(", ");
                    output.append(l.getValue());
                }
            }
            l.next();
        }
        System.out.println("Just the first name: " + l.toString(output));
        
        System.out.println("Please enter your last name: ");
        lName = input.nextLine();
        l.append(" ");
        for (int i=0; i<lName.length(); i++){
            l.append(lName.charAt(i));
        }
        for (int i=l.currPos(); i<l.length(); i++){
            if (l.getValue() != null){
                output.append(", ");
                output.append(l.getValue());
            }
            l.next();
        }
        System.out.println("you entered " + lName);
        System.out.println("With first and last names: " + l.toString(output));
        
        
        System.out.println("Please enter just your middle initial: ");
        mName = input.nextLine();
        System.out.println("you entered " + mName);
        l.moveToPos(fName.length());
        l.insert(mName);
        l.insert(".");
        
        output.insert(3*fName.length(),mName +", ., ");
        output.insert(3*fName.length(), "  , ");
        System.out.println("Full name: " + l.toString(output));
        //print out list with everything
        //System.out.println(l.length());
        //print out list with just initials
        /*
        l.moveToStart();
        for(int i = 0; i<l.length(); i++){
            if(i==0){
                output2.append(l.getValue());
                
            }else if(i==(fName.length())+1){
                output2.append(l.getValue());
                
            }else if(i==(fName.length()+4)){
                output2.append(l.getValue());
            }
            l.next();
        }
        */
        l.moveToStart();
        for(int i = 0; i<l.length(); i++){
            if(l.getValue().equals(fName.charAt(0))){
                output2.append(l.remove());  
            }else if(l.getValue().equals(mName)){
                output2.append(", " + l.remove());
            }else if(l.getValue().equals(lName.charAt(0))){
                output2.append(", " + l.remove());
            }
            l.next();
        }
        
        
        /*
        for(int i=0; i<output.length(); i++){
            if (Character.isUpperCase(output.charAt(i))){
                l.append(output.charAt(i));
                if (output2.isEmpty()){
                    output2.append(output.charAt(i));
                }else if (!(Character.isLetter(mName.charAt(0)))){
                    output2.append(", " + mName);
                }else{
                    output2.append(", ");
                    output2.append(output.charAt(i));
                }
            }
        }
        */
        
        System.out.println("Just initials: " + l.toString(output2));
        
    }
}
