class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        StringBuilder sBuilder = new StringBuilder();
        int[] secretNums = new int[10];
        int[] guessNums = new int[10];
        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i) == guess.charAt(i))
                a++;
            secretNums[secret.charAt(i)-'0']++;
            guessNums[guess.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            b += Math.min(secretNums[i], guessNums[i]);
        }
        b -= a;
        sBuilder.append(Integer.toString(a));
        sBuilder.append("A");
        sBuilder.append(Integer.toString(b));
        sBuilder.append("B");
        return sBuilder.toString();
    }
}