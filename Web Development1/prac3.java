import java.util.*; 
 
public class prac3 {    
     private char[][] keyMatrix;    
      private static final int SIZE = 5;     
      public prac3(String key) { 
        keyMatrix = generateKeyMatrix(key); 
    } 
    private char[][] generateKeyMatrix(String key) {         key = key.toUpperCase().replaceAll("J", "I");         boolean[] used = new boolean[26];         char[][] matrix = new char[SIZE][SIZE];         StringBuilder keyBuilder = new StringBuilder(); 
        for (char c : key.toCharArray()) {             if (c >= 'A' && c <= 'Z' && !used[c - 'A']) { 
                used[c - 'A'] = true; 
                keyBuilder.append(c); 
            } 
        } 
        for (char c = 'A'; c <= 'Z'; c++) {             if (c != 'J' && !used[c - 'A']) { 
                keyBuilder.append(c); 
            } 
        } 
        int index = 0; 
        for (int i = 0; i < SIZE; i++) { 
            for (int j = 0; j < SIZE; j++) { 
                matrix[i][j] = keyBuilder.charAt(index++); 
            } 
        } 
        return matrix; 
    } 
    private String preprocessText(String text) { 
        text = text.toUpperCase().replaceAll("J", "I").replaceAll("[^A-Z]", ""); 
        StringBuilder processedText = new StringBuilder(); 
        for (int i = 0; i < text.length(); i++) { 
            if (i > 0 && text.charAt(i) == text.charAt(i - 1) && i % 2 == 1) {                 processedText.append('X'); 
            } 
            processedText.append(text.charAt(i)); 
        } 
        if (processedText.length() % 2 == 1) { 
            processedText.append('X'); 
        }  
        return processedText.toString(); 
    } 
    private String processText(String text, boolean encrypt) { 
        text = preprocessText(text); 
        StringBuilder result = new StringBuilder();         for (int i = 0; i < text.length(); i += 2) {             char a = text.charAt(i);             char b = text.charAt(i + 1);             int[] posA = findPosition(a);             int[] posB = findPosition(b);             if (posA[0] == posB[0]) {                 result.append(keyMatrix[posA[0]][(posA[1] + (encrypt ? 1 : 4)) % SIZE]);                 result.append(keyMatrix[posB[0]][(posB[1] + (encrypt ? 1 : 4)) % SIZE]); 
            } else if (posA[1] == posB[1]) {                 result.append(keyMatrix[(posA[0] + (encrypt ? 1 : 4)) % SIZE][posA[1]]);                 result.append(keyMatrix[(posB[0] + (encrypt ? 1 : 4)) % SIZE][posB[1]]); 
            } else { 
                result.append(keyMatrix[posA[0]][posB[1]]);                 result.append(keyMatrix[posB[0]][posA[1]]); 
            } 
        } 
        return result.toString(); 
    } 
    private int[] findPosition(char c) {         for (int i = 0; i < SIZE; i++) {             for (int j = 0; j < SIZE; j++) {                 if (keyMatrix[i][j] == c) {                     return new int[]{i, j}; 
                } 
            } 
        } 
        return null; 
    } 
    public String encrypt(String plaintext) { 
        return processText(plaintext, true); 
    } 
    public String decrypt(String ciphertext) { 
        return processText(ciphertext, false); 
    } 
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter key: "); 
        String key = sc.nextLine(); 
        prac3 playfair = new prac3(key);    
        System.out.print("Enter plaintext: "); 
        String plaintext = sc.nextLine(); 
        String encrypted = playfair.encrypt(plaintext); 
        System.out.println("Encrypted text: " + encrypted); 
        String decrypted = playfair.decrypt(encrypted);         System.out.println("Decrypted text: " + decrypted);         sc.close(); 
    } 
} 
