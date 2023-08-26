import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int i=0;
        int j=i+1;
        int val=0;
        
        if(s.length()==1){
            val+=map.get(s.charAt(i));
        }
        else{
            while(j<s.length()){
                if(map.get(s.charAt(i))<map.get(s.charAt(j))){
                    val+=map.get(s.charAt(j))-map.get(s.charAt(i));
                    i+=2;
                    j+=2;
                }
                else {
                    val+= map.get(s.charAt(i));
                    i++;
                    j++;
                }

                if(j==s.length()){
                    val+= map.get(s.charAt(i));
                }
            }
        }
        return val;
    }
}
