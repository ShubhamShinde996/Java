package Java_Core;
// Vd.14 String Methods in java
public class Shubham11 {
    public static void main(String[] args) {
      // 1. simple string
      String a = "SHUBHAM"; // Defined Type 1
      String a1 = new String ("Shubham"); // Defined Type 2
        System.out.println(a);
        System.out.println(a1);

        // 2. Length of string
        String b = "SHUBHAM";
        System.out.println(b.length());

        // 3 . LowerCaes of String
        String b1 = new String ("SHUBHAM");
        System.out.println(b1.toLowerCase());


        // 4.toUpperCase of String
        String c = "shubham";
        System.out.println(c.toUpperCase());

        // 5.Without using trim
        String c1 = "   Shubham   ";
        System.out.println(c1);

        // 6. Using in trim
        String d ="    shubham    ";
        System.out.println(d.trim());

        // 7. substring(int short)
        String e = "shubham";
        System.out.println(e.substring(1));

        // 8 .substring Including in String
        String e1 = "Shubham";
        System.out.println(e1.substring(1,5));

        // 9. String in char of replace
        String f = "Shubham";
        System.out.println(f.replace('S','B'));

        //  10. String replace in leetrs
        String f1 = "Shubham";
        System.out.println(f1.replace("ham","a"));

        // 11 . Startwith() true / false
        String g = "Shubham";
        System.out.println(g.startsWith("nhu"));

        // 12 . endsWith() true / false
        String g1 = "Shubham";
        System.out.println(g1.endsWith("m"));

        // 13 . CharAt --> checking index in print char
        String h = "Shubham";
        System.out.println(h.charAt(2));

        // 14 . indexOf--->First substring return krtat
        String h1 = "Shubham";
        System.out.println(h1.indexOf('u'));

        // 15 . indexOf ---> return two and more char
        // mnje shodaycha asel tr index no. 2 chya pude shoda
        String i = "Shubham";
        System.out.println(i.indexOf("h",2));

        // 16 .lastIndexOf ---> last char read krta hain
        // search in last in string
        String i1 = "Shubham";
        System.out.println(i1.lastIndexOf('h'));

        // 17 . lastIndexOf ---> searching input number (string index no. select in the 3 in searching in 3 chaya pude )
        String j = "Shubham";
        System.out.println(j.lastIndexOf("h" , 3));

        // 18 . equals in the  don value equal ahet ka te check krt
        String j1 = "Shubham";
        System.out.println(j1.equals("shubham"));

        // 19. equalsIgnoreCase ---> equal aso ya nso  truech dakhvnar
        String k = "Shubham";
        System.out.println(k.equalsIgnoreCase("ShUbHaM"));

        ///  PART II : - Escape squence character
        // 1 . \n ----> new line
        System.out.println("I am shubham \nI am from Punee \nMy goal is Senior Software Developer ");

        // 2 . \t ----> tab meaning spaces in the sentences
        System.out.println("I am Young Boy \t in the gym"); //spaces

        // 3. \b -----> backspace
        System.out.println("Shubhams\bshinde");

        // 4 . \r-----> Carriage Return
        System.out.println("Hello\rworld");

        // 5 .single quote
        System.out.println("It\'s Java");

        // 6 . \" -----> double quote dakhvnyasati
        System.out.println("My Name is \"Shubham\"");

        // 7 . Backslash dakhvnyasti
        System.out.println("c:\\Java\\programs");

        // 8 . \f form feed
        System.out.println("Hello\fworld");
    }
}
