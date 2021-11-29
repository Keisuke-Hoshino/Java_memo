import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("入力してください");
    System.out.println("入力した内容を表示したい場合はshow、消したい場合はdelと入力してください");
    System.out.println("処理を終わらせたい場合はexitと入力してください");
    TextView showText = new TextView();
    showText.textView();
    }
  }



  class TextView {
    public static List<String> list = new ArrayList<String>();
      public void textView() {

        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
          String word = sc.next();
          list.add(word);

          int showCo = list.lastIndexOf("show");
          int showSize = list.size();
          if (showCo + 1 == showSize) {
            String[] array = list.toArray(new String[list.size()]);
            textShow(array);
          }

          int removeCo = list.lastIndexOf("del");
          int removeSize = list.size();
          if (removeCo + 1 == removeSize) {
            textRemove();
            System.out.println("入力した内容を表示したい場合はshow、消したい場合はdelと入力してください");
        }


        int finish = list.lastIndexOf("exit");
        int finishSize = list.size();
        if (finish + 1 == finishSize) {
          textFinish();
        }
      }

    }

     private static void textShow(String[] array){
      List<String> temp = new ArrayList<>(Arrays.asList(array));
      temp.remove("del");
      temp.remove("show");
      String[] arr = temp.toArray(new String[temp.size()]);
      for (int i = 0; i < arr.length; i++) {

        System.out.println((i + 1) + " : " + arr[i]);

      }
    }

    private static void textFinish() {
        System.exit(0);

    }


    private static void textRemove() {
            Scanner sc = new Scanner(System.in);
            System.out.println("削除したい文字は何番目ですか？");
            int line = sc.nextInt();
            list.remove(line-1);

          }

    }
