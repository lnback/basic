public class PrimeNumber{
    public static void main(String[] args){
        int maxn = 20001;
        boolean number[] = new boolean[maxn];
        int prime[] = new int[maxn];
        int j = 1;
        prime[0] = 2;
        number[4] = true;
        for(int i  = 3;i<maxn;i+=2){
            if(!number[i]) prime[j++] = i;
            for(int k = 0;k<j&&i*prime[k] < maxn;k++){
                number[i*prime[k]] = true;
                if( i % prime[k] == 0) break;
            }
        }
        for(int i = 1;i<j;i++){
            System.out.println(prime[i]);
        }
    }
}