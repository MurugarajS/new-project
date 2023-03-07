public class GFG {
 
    // Method 1
    public static void increase(int x, int y)
    {
        x++;
        y = y + 1;
 
        // Print statement
        System.out.println(x + " : " + y);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        int a = 10;
        int b = 40;
 
        increase(a, b);
 
        System.out.println(a + " : " + b);
    }
}