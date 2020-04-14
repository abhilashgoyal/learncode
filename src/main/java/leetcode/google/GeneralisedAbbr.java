package leetcode.google;


import java.util.ArrayList;
import java.util.List;

class GeneralisedAbbr {

    public List<String> generateAbbreviations(String word) {
        List<String> ret = new ArrayList<>();
        String current = "";
        helper(ret, "", word, word.length(), 0, 0);
        return ret;
    }

    private void helper(List<String> res, String curr, String word, int length, int pos, int cnt){
        if(pos == length){
            if(cnt > 0){
                curr += cnt;
            }
            res.add(curr);
        }else{

            helper(res, curr, word, length, pos+1, cnt+1);
            helper(res, curr+(cnt > 0 ? cnt : "")+word.charAt(pos),word,length, pos+1, 0);
        }
    }

    public static void main(String o []){
        GeneralisedAbbr ob = new GeneralisedAbbr();
        List<String> stringList = ob.generateAbbreviations("word");
        for(String result: stringList){
            System.out.println(result);
        }
    }
}
