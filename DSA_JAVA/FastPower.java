public class FastPower 
{
    public static void main(String[] args)
    {
        System.out.println(fastPower(43543535, 354353, 44353));
    }   
    
    //function to find (a^b % n)
    static long fastPower(long a, long b, int n)
    {
        long res = 1;
        while(b > 0)
        {
            if((b & 1) != 0) res = ((res) * (a % n)) % n;

            a = ((a % n) * (a % n)) % n;
            b = b >> 1;
        }
        return res;
    }
}
