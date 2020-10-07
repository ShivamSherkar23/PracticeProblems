import java.util.HashMap;
class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
           hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
          hm.put('D',500);
        hm.put('M',1000);
        int sum =0;
        int result = hm.get(s.charAt(0));
               
        for(int i=1; i<s.length();i++){
            if(result <hm.get(s.charAt(i))){
                sum -=result;
            }else{
                sum +=result;
            }
            result = hm.get(s.charAt(i));
        }
        sum +=result;
        return sum;
          
        
    }
    public static void main(String[] args) {
        String s = "XVII";
        RomanToInt rti = new RomanToInt();
        int result = rti.romanToInt(s);
        System.out.println(result);
    }
}