import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 応用編の無名クラスとラムダ式の比較。
 */
public class Sample05 {
  public static void main(String[] args) throws Exception {
    System.out.println(">>filterと組み合わせ");
    callFilterMixed();

    System.out.println(">>ラムダ式の呼び出し");
    callStreamToList();
  }

  /**
   * filterと組み合わせ。
   */
  private static void callFilterMixed() {
    List<String> list = Arrays.asList("100", "200", "300", "400");
    int sum = list.stream()
      .mapToInt(s -> Integer.parseInt(s))
      .filter(i -> i >= 300)
      .sum();
    System.out.println(sum);
  }

  /**
   * Streamをリストへ変換する。
   */
  private static void callStreamToList() {
    List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
    List<Integer> list2 = list.stream()
      .filter(i -> i >= 300)
      .collect(Collectors.toList());

    for (Integer i : list2) {
      System.out.println(i);
    }
  }
}
