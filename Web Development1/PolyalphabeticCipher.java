import java.util.Scanner;

public class PolyalphabeticCipher {

    // Method to encrypt the plaintext
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = key.toUpperCase();
        int keyLength = key.length();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                result.append((char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A'));
                j = (j + 1) % keyLength;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to decrypt the ciphertext
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = key.toUpperCase();
        int keyLength = key.length();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                result.append((char) ((c - key.charAt(j) + 26) % 26 + 'A'));
                j = (j + 1) % keyLength;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine();
        
        System.out.print("Enter the key: ");
        String key = scanner.nextLine();
        
        String encryptedText = encrypt(plaintext, key);
        System.out.println("Encrypted Text: " + encryptedText);
        
        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted Text: " + decryptedText);
        
        scanner.close();
    }
}
