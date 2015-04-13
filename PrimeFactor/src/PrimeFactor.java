import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrimeFactor {
    private ArrayList<Integer> primeFactors;
    private int number;

    public PrimeFactor(int number){
        this.number = number;
        primeFactors = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getPrimeFactors() {
        boolean[] isPrime = new boolean[number+1];
        for (int i = 2; i <= number; i++) {
            isPrime[i] = true;
        }
        for ( int i = 2; i * i <= number ; i++){
            if (isPrime[i]){
                for (int j = i; j* i <= number ; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        for ( int i = 2; i  <= number; i++){
            if (isPrime[i] && number % i == 0){
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }
}
