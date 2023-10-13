class Solution {
    public String addBinaryNumber(String a, String b) {
        //initialize all element
        int c = a.length()-1;
        int d = b.length()-1;
        int carry = 0;
        StringBuilder builder= new StringBuilder();

        while(c>=0 || d>=0){
            
            int sum = carry;
            if(c>=0) sum += a.charAt(c--) - '0';
            if(d>=0) sum+= b.charAt(d--) - '0';

            carry = sum>1 ? 1 : 0;
            builder.append(sum%2);
        }
        if(carry!=0) { builder.append(carry); }
        return builder.reverse().toString();
    }
}