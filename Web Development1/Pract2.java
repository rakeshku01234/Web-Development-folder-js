import java.util.HashMap; 
 import java.util.Map;
import java.util.Scanner; 
 
public class Pract2 { 
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    private final Map<Character, Character> encryptionMap;     
    private final Map<Character, Character> decryptionMap; 
 
    public Pract2(String key) {        
        
        encryptionMap = new HashMap<>();    
        decryptionMap = new HashMap<>();     
        for (int i = 0; i < ALPHABET.length(); i++) {           
            
            encryptionMap.put(ALPHABET.charAt(i), key.charAt(i));   
            decryptionMap.put(key.charAt(i), ALPHABET.charAt(i)); 
        } 
    } 
    public String encrypt(String plaintext) { 
        StringBuilder ciphertext = new StringBuilder();  
        plaintext = plaintext.toUpperCase();       
        for (char c : plaintext.toCharArray()) { 
            if (Character.isLetter(c)) { 
                ciphertext.append(encryptionMap.get(c)); 
            } else { 
                ciphertext.append(c);  
            } 
        } 
        return ciphertext.toString(); 
    } 
    public String decrypt(String ciphertext) {       
        StringBuilder plaintext = new StringBuilder();   
        ciphertext = ciphertext.toUpperCase();      
        for (char c : ciphertext.toCharArray()) { 
            if (Character.isLetter(c)) { 
                
                plaintext.append(decryptionMap.get(c)); 
            } else { 
                plaintext.append(c);  
            } 
        } 
 
        return plaintext.toString(); 
    } 
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a 26-letter key (substitution alphabet, without duplicates):"); 
        String key = sc.nextLine().toUpperCase();    
        if (key.length() != 26 || !key.chars().allMatch(Character::isLetter)) {   
            
            System.out.println("Invalid key! It must contain 26 unique letters.");   
            return; 
        } 
        
        Pract2 cipher = new Pract2(key); 
        System.out.println("Enter text to encrypt:"); 
        String plaintext = sc.nextLine(); 
        String encryptedText = cipher.encrypt(plaintext); 
        System.out.println("Encrypted Text: " + encryptedText);        
        String decryptedText = cipher.decrypt(encryptedText);      
        System.out.println("Decrypted Text: " + decryptedText);    
        sc.close(); 
    } 
} 
 
