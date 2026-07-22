class Main {
    public static void main(String[] args) {
        int vow = 0;
        int con = 0;
        String str = "Vel";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;
            } else {
                con++;
            }
        }
        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + con);
    }
}
