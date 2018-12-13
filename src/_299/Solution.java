package _299;

class Solution {
    public String getHint(String secret, String guess) {
        int[] table = new int[10];
        
        int total = 0;
        int bulls = 0;
        for (char c :secret.toCharArray()) {
            table[c - '0']++;
        }

        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
            if (table[guess.charAt(i) - '0']-- > 0) {
                total++;
            }
        }
        
        return bulls + "A" + (total - bulls)  + "B";
    }
}