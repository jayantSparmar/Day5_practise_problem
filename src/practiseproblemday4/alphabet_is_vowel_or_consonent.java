package practiseproblemday4;

public class alphabet_is_vowel_or_consonent
{
    public static void main(String[] args) {
        char ch = 'j';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
