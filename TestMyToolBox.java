
// Name: Ira Nikolaou 
// Student ID: 16061888 
// Assignment 2

public class TestMyToolBox {
    public static void main(String[] args) {
        //1. Repeat Method
        System.out.println(MyToolBox.centre("***Here we test the repeat method:***", 100));
        System.out.println("");
        MyToolBox.ruler();
        System.out.println();
        System.out.println(MyToolBox.repeat("1234567890",10));
        System.out.println(MyToolBox.repeat("Sometimes I repeat myself... ",3) + "< String is repeated 3 times");
        System.out.println(MyToolBox.repeat("This should be empty",-10) + "< Negative value returns empty String");
        System.out.println(MyToolBox.repeat("This should be empty",0) + "< 0 value returns empty String");
        System.out.println();
        
        //2. No Trailing Spaces Method
        System.out.println(MyToolBox.repeat("_", 100));
        System.out.println(MyToolBox.centre("***Here we test the noTrailingSpaces method:***", 100));
        MyToolBox.ruler();
        System.out.println();
        System.out.println(MyToolBox.repeat("1234567890",10));
        System.out.println(MyToolBox.noTrailingSpaces("  This has spaces left and right ") + "< Returns string with no trailing spaces");
        System.out.println(MyToolBox.noTrailingSpaces("  This has spaces on the left") + "< Returns string with no trailing spaces on the left");
        System.out.println(MyToolBox.noTrailingSpaces("This has spaces on the right    ") + "< Returns string with no trailing spaces on the rigt");
        System.out.println();
        
        //3. Centre Method
        System.out.println(MyToolBox.repeat("_", 100));
        System.out.println(MyToolBox.centre("***Here we test the centre method:***", 100));
        MyToolBox.ruler();
        System.out.println();
        System.out.println(MyToolBox.repeat("1234567890",10));
        System.out.println(MyToolBox.centre("This string has 30 characters!", 100) + "< Returns the 30 character string centred within the 100 character width");
        System.out.println(MyToolBox.centre("This string has 29 characters", 100) + "< Returns the 29 character string centred within the 100 character width with the additional space on the left");
        System.out.println(MyToolBox.centre("This string has 30 characters!", 20) + "< Returns the 30 character string trimmed to the 20 character width");
        System.out.println(MyToolBox.centre("This string has 30 characters!", 30) + "< Returns the 30 character string unaltered within the 30 character width");
        System.out.println(MyToolBox.centre("This string has 30 characters!", 0) + "< Returns blank as the width is 0");
        System.out.println(MyToolBox.centre("This string has 30 characters!", -20) + "< Returns blank as the width is less than 0");
        System.out.println();
        
        //4. Expand method
        System.out.println(MyToolBox.repeat("_", 100));
        System.out.println(MyToolBox.centre("***Here we test the expand method:***", 100));
        MyToolBox.ruler();
        System.out.println();
        System.out.println(MyToolBox.repeat("1234567890",10));
        System.out.println(MyToolBox.expand("How long could this string be? It's 50 characters.",80) + "< Adds spaces to the right to make the 50 text length equal to the 80 character width");
        System.out.println(MyToolBox.expand("How long could this string be? It's 50 characters.",30) + "< Trims the 50 charcter text to fit the the 30 character width");
        System.out.println(MyToolBox.expand("How long could this string be? It's 50 characters.",50) + "< Returns text unaltered as length is equal to the 50 character width");
        System.out.println(MyToolBox.expand("How long could this string be? It's 50 characters.",0) + "< Returns blank as the width is 0");
        System.out.println(MyToolBox.expand("How long could this string be? It's 50 characters.",-50) + "< Returns blank as the width is less than 0");
        System.out.println();
        
        //5. Trim Method
        System.out.println(MyToolBox.repeat("_", 100));
        System.out.println(MyToolBox.centre("***Here we test the trim method:***", 100));
        MyToolBox.ruler();
        System.out.println();
        System.out.println(MyToolBox.repeat("1234567890",10));
        System.out.println(MyToolBox.trim("How long could this string be? It's 50 characters.",80) + "< Adds spaces to the right to make the 50 text length equal to the 80 character width");
        System.out.println(MyToolBox.trim("How long could this string be? It's 50 characters.",30) + "< Trims the 50 charcter text to fit the the 30 character width");
        System.out.println(MyToolBox.trim("How long could this string be? It's 50 characters.",50) + "< Returns text unaltered as length is equal to the 50 character width");
        System.out.println(MyToolBox.trim("How long could this string be? It's 50 characters.",0) + "< Returns blank as the width is 0");
        System.out.println(MyToolBox.trim("How long could this string be? It's 50 characters.",-50) + "< Returns blank as the width is less than 0");
        System.out.println();
        
      
    }
}
