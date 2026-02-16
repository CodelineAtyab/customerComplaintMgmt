public class Atyab {
    public static void main(String[] args) {
        /*for (String currArg: args) {
            System.out.println(currArg);
        }*/

        for (int count = 0;count < 5;count++){
            System.out.printf("Loop %d\n", count);

        }

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int index=0; index < alphabets.length(); index++) {
            System.out.println(alphabets.charAt(index));
        }
    }
}
