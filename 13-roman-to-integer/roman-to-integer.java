import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int total =0;
        int prev = 0;
        for(int i =0;i<s.length();i++)
        {
            int cur = romanMap.get(s.charAt(i));

            if(prev<cur)
            {total += cur -2*prev ;}
            else
            {
                total += cur;
            }
            prev = cur;
        }
        return total;
    }
}