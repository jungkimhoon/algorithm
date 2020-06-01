import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1 = 0; int answer2 = 0; int answer3 = 0;        

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<answers.length; i++){
            if(answers[i] == su1[i % su1.length]) answer1++;
            if(answers[i] == su2[i % su2.length]) answer2++;
            if(answers[i] == su3[i % su3.length]) answer3++;
        }

        int maxValue = Math.max(answer1, Math.max(answer2, answer3));
        if(answer1 == maxValue) list.add(1);
        if(answer2 == maxValue) list.add(2);
        if(answer3 == maxValue) list.add(3);

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){ 
            answer[i] = list.get(i);
        }

        return answer;
    }
}