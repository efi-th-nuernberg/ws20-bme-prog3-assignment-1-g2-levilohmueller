class Main {

  public static void main(String[] args) {

    int z = 0;

for(int i = 1; i <= 200; i++){
   z = i;

     {
      System.out.println(z);
      if(i %5 == 0 )
      System.out.println("ZAHL ist durch 5 teilbar!");
      if (i % 10 == 9)
      System.out.println("ZAHL endet auf 9!");
      if(((i-1) + i) %3 == 0)
       System.out.println("ERGEBNIS ist durch 3 teilbar");
     }
  }
  }
  }