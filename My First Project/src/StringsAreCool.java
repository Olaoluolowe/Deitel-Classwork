public class StringsAreCool {
    public static void main(String[] args) {
        String codenific = "Codenific" ;
        System.out.println("1. "+ codenific);

        codenific += ".com" ;
        System.out.println( "2. "+ codenific);


        String onlyCodenific = codenific.substring(0, 9);
        System.out.println("3. "+ onlyCodenific);

        String onlyDotCom =  codenific.substring(9, 13);
        System . out . println( "4." + onlyDotCom);


        codenific = " " + codenific + " " ;
        codenific = codenific. trim();
        System.out.println("5. "+codenific);

        System.out.println( "6. " + codenific. toUpperCase());
        System.out.println( "7. " + codenific. toLowerCase());

        System.out.println( "-> " + codenific. length());




    }
}
