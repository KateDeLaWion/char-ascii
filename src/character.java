public class character {

    public static void main(String[] args){
        char letter =  'h' ;

        //First way
        int ascii = letter;
        System.out.println("The ASCII value of " + letter + " is: " + ascii);


        //Second way
        int castAscii = (int) letter;
        System.out.println("The ASCII value of " + letter + "h is this:" + castAscii);

    }
}
