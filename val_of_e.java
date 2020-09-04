import java.io.*;
class Main
 {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    work();
  }
  public static void work()
  {
    double sum = 0;
    for(double i = 0; i < 10000 ; i++)
    {
      sum = sum+(1/fact(i));
    }
    System.out.println(sum);
  }
  public static double fact(double n)
  {
    if(n == 0)
    {
      return(1);
    }
    else
    {
      return(n*fact(n-1));
    }
  }
}
