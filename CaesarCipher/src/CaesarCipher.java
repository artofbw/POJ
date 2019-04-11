// Łukasz Ćwikliński s19334

class CaesarCipher
{
    // the CaesarCipher class has one fields
    String name;

    // the CaesarCipher class has one constructor
    public CaesarCipher(String name) {
        this.name = name;
    }

    // the CaesarCipher class has one method
    public StringBuffer encrypt(int shift) {
        StringBuffer result = new StringBuffer();

        for (int i=0; i < name.length(); i++)
        {
            if (Character.isUpperCase(name.charAt(i))) {
                char ch = (char)(((int)name.charAt(i) + shift - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                if (Character.isSpaceChar(name.charAt(i))) {
                    result.append(" ");
                }
                else {
                    char ch = (char)(((int)name.charAt(i) + shift - 97) % 26 + 97);
                    result.append(ch);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher("LUKASZ CWIKLINSKI");
        System.out.println(caesarCipher.encrypt(3));
    }
} 
