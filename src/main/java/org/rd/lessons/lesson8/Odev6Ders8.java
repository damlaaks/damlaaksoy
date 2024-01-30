public class Odev6Ders8 {
    public static void main (String[] args) {
        String[] metin = new String[]{"ben damla aksoy", "java ogreniyorum"};
        String ortakKarakterler = "";

        for (int i = 0; i < metin.length; i++) {
            for (int j = i + 1; j < metin.length; j++) {
                String commonChars = findCommonCharacters(metin[i], metin[j]);
                if (commonChars.length() > ortakKarakterler.length()) {
                    ortakKarakterler = commonChars;
                }
            }
        }

        System.out.println("Ortak Karakterler: " + ortakKarakterler);
    }

    private static String findCommonCharacters(String str1, String str2) {
        String commonChars = "";

        for (char ch : str1.toCharArray()) {
            if (str2.contains(String.valueOf(ch)) && commonChars.indexOf(ch) == -1) {
                commonChars += ch;
            }
        }

        return commonChars;
    }
}