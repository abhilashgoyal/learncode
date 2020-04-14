package leetcode;

import java.util.HashMap;
import java.util.Map;

class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> taskFrequency = new HashMap<>();
        int count = 0;
        for(char c : tasks){
            int freq = taskFrequency.getOrDefault(c,0);
            taskFrequency.put(c, freq++);
        }

        return count;
    }
}