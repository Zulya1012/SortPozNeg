package arr;

public class Arr {

  public static void main(String[] args) {
    int[] x = {
      3,
      2,
      7,
      -5,
      9,
      -3,
      -8,
      1
    };

    int countNeg = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] < 0) {
        countNeg++;
      }
    }
    System.out.println(countNeg);

    int[] poz = new int[x.length - countNeg];
    int[] neg = new int[countNeg];
    int p = 0;
    int n = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] < 0) {
        neg[n++] = x[i];
      } else {
        poz[p++] = x[i];
      }
    }
    for (int i = 0; i < poz.length; i++) {
      System.out.print(poz[i] + " ");
    }

    System.out.println();

    for (int i = 0; i < neg.length; i++) {
      System.out.print(neg[i] + " ");
    }
  }
}
