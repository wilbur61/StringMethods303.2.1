import java.util.Arrays;

public class lengthDemo {
	
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10
        
        // IsEmpty() method:
        // This method checks whether the String contains anything 
        // or not. If the Java String is empty, it returns true or false

        System.out.println(str1.isEmpty()); 
        System.out.println(str2.isEmpty());
        
        // Trim() method:
        // The Java string trim() method removes the leading and trailing spaces
        
        String s1="  hello   "; 
        System.out.println(s1+"how are you");        // without trim() 
        System.out.println(s1.trim()+"how are you"); // with trim() 

        //toLowerCase() method:
        //	The toLowerCase() method converts all the characters of the String to lowercase
        
        String s11="HELLO HOW Are You?";
        String s1lower=s11.toLowerCase();
        System.out.println(s1lower);
        
        //concat() method
        // You can also use the + operator to concatenate two or more strings. 
        // But the Java String class provides the concat() method
        
        //------By using concat method----
         str1 = "Learn ";
         str2 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(str2.concat(str1)); // "JavaLearn "
      //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
      //  String s5 = s3.concat(s4); or
           String s5 = s3 + s4;
      //both of the above statement will give you the same result
           System.out.println(s5);

       // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        System.out.println(message);

      // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
        System.out.println(s);

    // String Supplement is concatenated with character B
        String s2 = "Supplement" + 'B'; // s2 becomes SupplementB
        System.out.println(s2);
   
        //===============================================
        //split() method
        // The split() method divides the string at the specified 
        // regex and returns an array of substrings.
        
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        
        
        // charAt() method: Getting Characters From a String
        
        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is " + message1.charAt(0));
        
        //compareTo() method:
        //	The Java String compareTo() method compares the given string with the current string

        String st1="hello";
        String st2="hello";
        String st3="hemlo";
        String st4="flag";
        System.out.println(st1.compareTo(st2)); // 0 because both are equal
        System.out.println(st1.compareTo(st3)); //-1 because "l" is only one time lower than "m"
        System.out.println(st1.compareTo(st4)); // 2 because "h" is 2 times greater than "f"

        // Substrings() method:
        
        str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));
        
        
        //  indexOf() method:
        // The indexOf() method returns the index of the first occurrence 
        // of the specified character/substring within the string
        
        String str11 = "Java is fun";
        int result2;


        // getting index of character 's'
        result2 = str11.indexOf('a');

        System.out.println(result2);

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.lastIndexOf("planet"));
        System.out.println(myStr.indexOf("planet"));
        
        // contains() method:
        //	The contains() method checks whether the specified string 
        // (sequence of characters) is present in the string or not.
        
        myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false
        
        //replace() method
        // The replace() method replaces each matching occurrence of the 
        // old character/text in the string with the new character/text
        
        myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));
        
        //Java String compares
        //
        // By Using equals() Method
        // 
         s1="PerScholas";
         s2="PerScholas";
         s3=new String("PerScholas");
         s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true 
        System.out.println(s1.equals(s4));//false
        
        // By Using == operator: The == operator compares references, not values.
         s1="Perscholas";
         s2="Perscholas";
         s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)

        // By Using compareTo() method
        //
        
        String t1="Perscholas";
        String t2="Perscholas";
        String t3="Perscholas";
        System.out.println(t1.compareTo(t2));//0
        System.out.println(t1.compareTo(t3));//1(because s1>s3)
        System.out.println(t3.compareTo(t1));//-1(because s3 < s1 )

        
        
        
        
        
        
    }
    

}
