public class vowel_constant {
 public static void main(String[] args) {
     char character = '0';

     if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
             || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U') {
        System.out.println(character+ " is a vowel character");
    } else {
        
        System.out.println(character+ " is a consonant character");
    }
 }   
}
