import java.util.Arrays;

public class SieveOfEratosthenes 
{

    public static void main(String[] args)
    {
        boolean primeNums[] = sieveOfEratosthenes(20);
        for(int i = 0; i <= 20; i++)
        {
            System.out.println(i + " " + primeNums[i]);
        } 
    }

    static boolean[] sieveOfEratosthenes(int n)
    {
        //declaring a new boolean array with size (n+1), just to make it easy to
        //look for numbers which are prime, otherwise we have to check which no.
        //is present on which index.
        boolean isPrime[] = new boolean[n+1];

        //this function is present in Collections class to set a particular value
        //to each index on an array
        Arrays.fill(isPrime, true);

        //0 and 1 are non-prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        //For eg. Range is 0 - 10
        //[0   1   2   3   4   5   6   7   8   9   10]
        //[F   F   T   T   F   T   F   T   F   F   F]
        for(int i = 2; i * i <= n; i++)
        {
            for(int j = 2 * i; j <= n; j += i)
            {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
    
}
