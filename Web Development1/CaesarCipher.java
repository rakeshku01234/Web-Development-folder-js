public class CaesarCipher {   
    public static String encrypt(String text, int shift) { 
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < text.length(); i++) {           
            char ch = text.charAt(i); 
           
            if (Character.isUpperCase(ch)) { 
                char c = (char) ((ch + shift - 'A') % 26 + 'A');               
                result.append(c); 
            } 
            else if (Character.isLowerCase(ch)) {               
                char c = (char) ((ch + shift - 'a') % 26 + 'a');               
                result.append(c); 
            } 
            else { 
                result.append(ch); 
            } 
        } 
        return result.toString(); 
    } 

    public static void main(String[] args) {       
        String plainText = "jeet, pandya !";        
        int shift = 3; 

        String cipherText = encrypt(plainText, shift); 

        System.out.println("Plain Text: " + plainText); 
        System.out.println("Cipher Text: " + cipherText); 
    } 
}
