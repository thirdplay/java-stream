import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * mapToInt/sumを使用した無名クラスとラムダ式の比較。
 */
public class Sample04 {
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
    List<String> list = Arrays.asList("100", "200", "300", "400");
    int sum = list.stream().mapToInt(new ToIntFunction<String>() {
      @Override
      public int applyAsInt(String s) {
        return Integer.parseInt(s); // 変換
      }
    }).sum();
    System.out.println(sum);
  }

  /**
   * ラムダ式の呼び出し。
   */
  private static void callLambdaExpression() {
    List<String> list = Arrays.asList("100", "200", "300", "400");
    int sum = list.stream()
      .mapToInt(s -> Integer.parseInt(s))
      .sum();
    System.out.println(sum);
  }
}
