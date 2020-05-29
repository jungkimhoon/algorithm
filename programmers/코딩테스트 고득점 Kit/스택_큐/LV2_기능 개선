import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Job> jobs = new LinkedList<>();
 
        for (int i = 0; i < progresses.length; i++) {
            Job job = new Job();
            job.progress = progresses[i];
            job.speed = speeds[i];
            jobs.add(job);
        }
 
        List<Integer> doneCountList = new ArrayList<>();
 
        while (!jobs.isEmpty()) {
            int doneCount = 0;
            boolean lastJobIsDone = true; // for the first job
 
            for (Job job : jobs) {
                job.progress += job.speed;
 
                if (lastJobIsDone && job.progress >= 100) {
                    doneCount++;
                } else {
                    lastJobIsDone = false;
                }
            }
 
            if (doneCount > 0) {
                for (int i = 0; i < doneCount; i++) {
                    jobs.remove();
                }
 
                doneCountList.add(doneCount);
            }
        }
 
        int[] answer = new int[doneCountList.size()];
 
        for (int i = 0; i < doneCountList.size(); i++) {
            answer[i] = doneCountList.get(i);
        }
 
        return answer;
    }
 
    private class Job {
        int progress;
        int speed;
    }
}
