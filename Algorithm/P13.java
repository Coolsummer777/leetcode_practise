class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'I'){
                if(i < s.length()-1){
                    if(s.charAt(i+1) == 'V'){
                        sum += 4;
                        i += 2;
                    }else if(s.charAt(i+1) == 'X'){
                        sum += 9;
                        i += 2;
                    }else{
                        sum += 1;
                        i += 1;
                    }
                }else{
                    sum += 1;
                    i += 1;
                }
            }else if(s.charAt(i) == 'X'){
                if(i < s.length()-1){
                    if(s.charAt(i+1) == 'L'){
                        sum += 40;
                        i += 2;
                    }else if(s.charAt(i+1) == 'C'){
                        sum += 90;
                        i += 2;
                    }else{
                        sum += 10;
                        i += 1;
                    }
                }else{
                    sum += 10;
                    i += 1;
                }
            }else if(s.charAt(i) == 'C'){
                if(i < s.length()-1){
                    if(s.charAt(i+1) == 'D'){
                        sum += 400;
                        i += 2;
                    }else if(s.charAt(i+1) == 'M'){
                        sum += 900;
                        i += 2;
                    }else{
                        sum += 100;
                        i += 1;
                    }
                }else{
                    sum += 100;
                    i += 1;
                }
            }else if(s.charAt(i) == 'V'){
                sum += 5;
                i += 1;
            }else if(s.charAt(i) == 'L'){
                sum += 50;
                i += 1;
            }else if(s.charAt(i) == 'D'){
                sum += 500;
                i += 1;
            } else{
                sum += 1000;
                i += 1;
            }
        }
        return sum;
    }
}