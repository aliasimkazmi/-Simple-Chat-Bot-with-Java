// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    int a = 4;
    System.out.println("Stage 1 :");
    System.out.println(a);
    int b = a++;
    System.out.println("Stage 2 :");
    System.out.println(a);
    System.out.println(b);
    int c = --a + b++;
    System.out.println("Stage 3 :");
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
    int result = ++a - (c++ - b) + c;
    System.out.println("Stage 4 :");
    System.out.println(result);
  }
}
