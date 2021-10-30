import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * filterを使用した無名クラスとラムダ式の比較。
 */
public class Sample03 {
  public static void main(String[] args) throws Exception {
    System.out.println(">>無名クラス呼び出し");
    callAnonymousClass();

    System.out.println(">>ラムダ式の呼び出し");
    callLambdaExpression();
  }

  /**
   * 無名クラス呼び出し。
   */
  private static void callAnonymousClass() {
    List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
    list.stream().filter(new Predicate<Integer>() {
      @Override
      public boolean test(Integer i) {
        return i >= 300;
      }
    }).forEach(i -> System.out.println(i));
  }

  /**
   * ラムダ式の呼び出し。
   */
  private static void callLambdaExpression() {
    List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
    list.stream()
      .filter(i -> i >= 300)
      .forEach(i -> System.out.println(i));
  }
}
