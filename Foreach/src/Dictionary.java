import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<String> words = new ArrayList<>();

    public void addWord(String name){
        words.add(name);
    }

    public List<String> findTargetWords(){
        List<String> targetWords = new ArrayList<>();

        for (int i = 0; i < words.size(); i++){
            if (!words.get(i).isEmpty() && words.get(i).length() < 5){
                targetWords.add(words.get(i));
            }
        }

        return targetWords;
    }
}
