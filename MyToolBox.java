
// Name: Ira Nikolaou 
// Student ID: 16061888 
// Assignment 2

public class MyToolBox {
    public static void ruler() {
        int i;
     
        for(i = 1; i <= 10; i++) {
            System.out.print(MyToolBox.repeat(" ",9)+i);
        }
    }

    public static String repeat(String text, int times) {
        var repeatedString = "";

        while (times > 0) {
            repeatedString += text; 
            times--;
        }
        return repeatedString;
    }

    public static String noTrailingSpaces(String text) {
        return text.trim();

    }

    public static String centre(String text, int width) {
        int n = text.length(); 
        int before = (width - n)/2;
        int rest = width - before;
        int leftspace = before + 1;
        int rightspace = rest - 1;
        
        if (width < 0) 
            return text = "";
        
        else if (width <= n)
            return text.substring(0, width);

        else if (before == 0)
            return String.format("%-" + width + "s", text);
            
        else
            return String.format("%" + leftspace + "s%-" + rightspace + "s", "", text);  
    }

    public static String expand(String text, int width) {
        int n = text.length(); 

        if (width <= 0) 
            return text = "";

        else if (n == width)
            return text; 

        else if (n > width)
            return text.substring(0, width);

        else 
            return String.format("%-" + width + "." + width + "s", text);

    }

    public static String trim(String text, int width) {
        return expand (text, width); 
    }
}