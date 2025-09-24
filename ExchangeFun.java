public class ExchangeFun{
  
  public void exchange(int x,int w) {
    int temp = x;
    x = w;
    w = temp;
    System.out.println (x + " and " + w);
  }

}