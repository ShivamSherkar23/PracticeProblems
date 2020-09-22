class ReverseDigit {
    public int reverse(int x) 
    {
        boolean flag = false;
        if(x< 0)
        {
             flag = true;
            x = x*-1;
        }
        long rev = 0;
        while(x>0)
        {
            int digit = x%10;
            rev = rev *10 +digit;
            x = x/10;  
        }
        if(rev > Integer.MAX_VALUE)
        {
            return 0;
        }
         else if (flag != false)
            return -1 *(int) rev;
         else
            return (int)rev;
    }
    public static void main(String args[]) {
        int dat = -123;
        ReverseDigit rd = new ReverseDigit();
        int result = rd.reverse(dat);
        System.out.println(result);
        
    }
}