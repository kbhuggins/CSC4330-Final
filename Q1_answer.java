//Kahrin Huggins - csc4330 final q1
//Write code for a state diagram to recognize the floating-point literals, integer literals, string
//literals and variable names of any programming language that was developed after 1990.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1_answer{


    public static void main(String[] args) {
        String message;

        System.out.println("Enter a number or string:");
        Scanner sc = new Scanner(System.in);
        String inValue = sc.nextLine();

        //floating point literal
        String pattern = "([0-9]*)([e|.]{1})([0-9]+)([f|F]?)"; //more specifics needed to differentiate from integer literal
        Pattern reg = Pattern.compile(pattern);
        Matcher match = reg.matcher(inValue);

        //integer literal
        String pattern2 = "([0-9]+)([^.])([^f])";
        Pattern reg2 = Pattern.compile(pattern2);
        Matcher match2 = reg2.matcher(inValue);

        //string literal
        String pattern3 = "([a-zA-Z]+)([/s]?)";
        Pattern reg3 = Pattern.compile(pattern3);
        Matcher match3 = reg3.matcher(inValue);

        //variable name
        String pattern4 = "([^$|^_])([a-zA-Z]+)([_]?)([a-zA-Z]?)";
        Pattern reg4 = Pattern.compile(pattern4);
        Matcher match4 = reg4.matcher(inValue);

        if(match.find()){ //floating point literal finder


            message = "Floating point literal";
            System.out.println(message);

        }else if (match2.find()){   //integer literal finder

            message = "Integer literal";
            System.out.println(message);

        }else if(match3.find()){ //string literal finder
            message = "String literal";
            System.out.println(message);

        }else if(match4.find()){ //variable name finder
            message = "Valid variable name";
            System.out.println(message);
        }
    }
}

