class Solution {
    public String addBinary(String a, String b) {
        int len = a.length();
        StringBuilder sBuilder = new StringBuilder();
        if(b.length() > len) len = b.length();
        a = reverse(a);
        b = reverse(b);
        System.out.println(a);
        System.out.println(b);
        int temp = 0;
        for(int i=0;i<len;i++){
            if(i<a.length() && i<b.length()){
                temp = temp + a.charAt(i) + b.charAt(i) -'0' -'0';
                sBuilder.append(String.valueOf(temp % 2));
                temp /= 2;
            }else{
                char c = '0';
                if(i<a.length()) c = a.charAt(i);
                if(i<b.length()) c = b.charAt(i);
                temp = temp + c -'0';
                sBuilder.append(String.valueOf(temp % 2));
                temp /= 2;
            }
        }
        if(temp>0) sBuilder.append(temp);
        return sBuilder.toString();
    }

    public String reverse(String s){
        StringBuilder sBuilder = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sBuilder.append(s.charAt(i));
        }
        return sBuilder.toString();
    }
}