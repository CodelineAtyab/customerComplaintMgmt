public class Atyab {
    public static void main(String[] args) {
        /*for (String currArg: args) {
            System.out.println(currArg);
        }*/

        for (int theCounter = 0;theCounter < 5;theCounter++){
            System.out.printf("Loop %d\n", theCounter);
        }

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int index=0; index < alphabets.length(); index++) {
            System.out.println(alphabets.charAt(index));
        }
    }
}
