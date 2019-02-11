class Main {
  public static void main(String[] args) {
    int N = 2, K = 3;

        long result = 1;

        while (K != 0)
        {
            result *= N;
            --K;
        }
         System.out.println("Answer = " + result);
    }
}
