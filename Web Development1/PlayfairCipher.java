
import java.util.Scanner; 
 
public class PlayfairCipher { 
 
    private static final char[][] keyMatrix = new char[5][5]; 
 
    public static void main(String[] args) {       
          Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter the key for Playfair Cipher:");         String key = scanner.nextLine(); 
 
        System.out.println("Enter the plaintext to encrypt:");         String plaintext = scanner.nextLine(); 
 
        generateKeyMatrix(key); 
        String encryptedText = encrypt(plaintext); 
       System.out.println("Encrypted Text: " + encryptedText); 
       System.out.println("Enter the ciphertext to decrypt:"); 
    String ciphertext = scanner.nextLine(); 
   String decryptedText = decrypt(ciphertext); 
       System.out.println("Decrypted Text: " + decryptedText); 
   } 
    private static void generateKeyMatrix(String key) {         boolean[] charUsed = new boolean[26]; 
        key = key.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I"); 
 
        int row = 0, col = 0; 
 
        for (char c : key.toCharArray()) {             if (!charUsed[c - 'A']) {                 keyMatrix[row][col++] = c;                 charUsed[c - 'A'] = true; 
                if (col == 5) {                     col = 0; 
                    row++; 
                } 
            } 
        } 
 
        for (char c = 'A'; c <= 'Z'; c++) {             if (!charUsed[c - 'A'] && c != 'J') {                 keyMatrix[row][col++] = c;                 charUsed[c - 'A'] = true; 
                if (col == 5) {                     col = 0; 
                    row++; 
                } 
            } 
        } 
    } 
 
    private static String encrypt(String text) { 
        text = formatText(text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I"));         StringBuilder encryptedText = new StringBuilder(); 
 
        for (int i = 0; i < text.length(); i += 2) {             char a = text.charAt(i); 
           char b = text.charAt(i + 1); 
           encryptedText.append(encryptPair(a, b)); 
       } 
    return encryptedText.toString(); }
   private static String decrypt(String text) { 
       text = text.toUpperCase(); 
       StringBuilder decryptedText = new StringBuilder(); 
 
        for (int i = 0; i < text.length(); i += 2) {             char a = text.charAt(i);             char b = text.charAt(i + 1); 
            decryptedText.append(decryptPair(a, b)); 
        } 
 
        return decryptedText.toString(); 
    } 
 
    private static String encryptPair(char a, char b) {         int[] posA = findPosition(a);         int[] posB = findPosition(b); 
 
        if (posA[0] == posB[0]) { 
            return "" + keyMatrix[posA[0]][(posA[1] + 1) % 5] + keyMatrix[posB[0]][(posB[1] + 1) % 5]; 
        } else if (posA[1] == posB[1]) { 
            return "" + keyMatrix[(posA[0] + 1) % 5][posA[1]] + keyMatrix[(posB[0] + 1) % 5][posB[1]]; 
        } else { 
            return "" + keyMatrix[posA[0]][posB[1]] + keyMatrix[posB[0]][posA[1]]; 
        } 
    } 
 
    private static String decryptPair(char a, char b) {         int[] posA = findPosition(a);         int[] posB = findPosition(b); 
 
        if (posA[0] == posB[0]) { 
            return "" + keyMatrix[posA[0]][(posA[1] + 4) % 5] + keyMatrix[posB[0]][(posB[1] + 4) % 5]; 
        } else if (posA[1] == posB[1]) { 
            return "" + keyMatrix[(posA[0] + 4) % 5][posA[1]] + keyMatrix[(posB[0] + 4) % 5][posB[1]]; 
        } else { 
            return "" + keyMatrix[posA[0]][posB[1]] + keyMatrix[posB[0]][posA[1]]; 
        } 
    } 
   private static String formatText(String text) { 
       StringBuilder formatted = new StringBuilder(); 
    for (int i = 0; i < text.length(); i++) { 
       char current = text.charAt(i); 
           if (i + 1 < text.length() && current == text.charAt(i + 1)) {                formatted.append(current).append('X'); 
           } else { 
               formatted.append(current); 
            } 
        } 
 
        if (formatted.length() % 2 != 0) { 
            formatted.append('X'); 
        } 
 
        return formatted.toString(); 
    } 
 
    private static int[] findPosition(char c) { 
        for (int i = 0; i < 5; i++) {             for (int j = 0; j < 5; j++) {                 if (keyMatrix[i][j] == c) { 
                    return new int[]{i, j}; 
                } 
            } 
        } 
        throw new IllegalArgumentException("Character " + c + " not found in key matrix"); 
    } 
} 
 
