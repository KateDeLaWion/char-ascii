public class ascii2char {
    public static void main(String[] args) {

        for (int i=1 ;i<=122; i++) {

            char c = (char) i;
            if( i%11 == 0) {
                System.out.println();
            }
                System.out.print(c + " ");
        }


    }
}
