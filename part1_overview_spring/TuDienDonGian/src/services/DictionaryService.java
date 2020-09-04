package services;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    static Map<String,String> dictionary;
    static {
        dictionary =new HashMap<String, String>();
        dictionary.put("hello","Xin chào");
        dictionary.put("good","Tốt");
        dictionary.put("you","Bạn");
        dictionary.put("he","Cậu ấy");
    }

    public static Map<String, String> getDictionary() {
        return dictionary;
    }
}
