public class Greeting
{
    public static void main(String[] args)
    {
       String gr="hello world of string";
       String txt="aBcdEfgHijkLmnoPqRstuvwxyz";
        System.out.println(gr);
        System.out.println(txt);
        System.out.println("length of string = " + " "+ txt.length());
        System.out.println(gr.toUpperCase());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(gr.toLowerCase());
        System.out.println(gr.indexOf("world"));
        System.out.println(txt.indexOf("z"));
        System.out.println(txt.indexOf("B"));
    }
}
