package backjoon;

public class B15596 {

    long sum(int[] a){
        long N_plus = 0;
        for(int i=0; i<a.length; i++){
            N_plus += a[i];
        }
        return N_plus;
    }
}
