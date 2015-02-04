public class FizzBuzz {

  public static void main(String[] args) {
    for(int i = 1 ; i <= 100 ; i++){
      if( i %3 == 0 ) {
        System.out.printf("Fizz");
      }
      if (i % 5 == 0) {
        System.out.printf("Buzz");
      }
      if( i %3 != 0 && i%5 != 0) {
        System.out.printf("%d", i);
      }
      System.out.printf("\n");
    }
  }

}
