import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] words = {
                "hello",
                "",
                "love",
                "hi",
                "student"
        };

        Dictionary dictionary = new Dictionary();

        for (int i = 0; i < words.length; i++) {
            dictionary.addWord(words[i]);
        }

        /**
         *          // 拡張for文ver
         *         for (String word : words){
         *             dictionary.addName(words);
         *         }
         */

        List<String> selectedWords = dictionary.findTargetWords();
        for (int i = 0; i < selectedWords.size(); i++) {
            System.out.println(i + 1 + "：" + selectedWords.get(i));
        }

        /**
         * 拡張for文を使用しているのにselectedWords.get(count)とするのはよくない
         *         int count = 0;
         *         for (String name : selectedWords) {
         *             System.out.println(count + 1 + "：" + selectedWords.get(count));
         *         }
         */
    }
}
