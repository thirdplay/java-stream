interface Iface1 {
  public void method(int i, String s);
}

/**
 * 関数型インターフェース(Iface1)を使用した無名クラスとラムダ式の比較。
 */
public class Sample01 {
  public static void main(String[] args) throws Exception {
    System.out.println(">>無名クラス呼び出し");
    callAnonymousClass();

    System.out.println(">>ラムダ式の呼び出し１");
    callLambdaExpression01();

    System.out.println(">>ラムダ式の呼び出し２");
    callLambdaExpression02();
  }

  /**
   * 無名クラス呼び出し。
   */
  private static void callAnonymousClass() {
    Iface1 if1 = new Iface1() {
      public void method(int i, String s) {
        System.out.println(i + s);
      }
    };
    if1.method(123, "xyz");
  }

  /**
   * ラムダ式の呼び出し１。
   */
  private static void callLambdaExpression01() {
    Iface1 if1 = (i, s) -> System.out.println(i + s);
    if1.method(123, "xyz");
  }

  /**
   * ラムダ式の呼び出し２。
   */
  private static void callLambdaExpression02() {
    Iface1 if1 = (i, s) -> {
      System.out.println(i);
      System.out.println(s);
    };
    if1.method(123, "xyz");
  }
}
