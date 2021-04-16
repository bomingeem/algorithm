package study.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class prg42583 {
    public static void main(String[] args) {
        //다리를 지난 트럭 = 대기트럭이 같으면 다 건넜다고 볼 수 있거나 대기와 대기와 다리를 건넌 차량이 없으면 다 건넜다고 볼 수 있다
        int answer = 0;
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        int max = 0;

        Queue<Integer> bridgeToCross = new LinkedList<>(); //다리를 건넌

        for (int truck : truck_weights) {
            while(true) {
                if(bridgeToCross.isEmpty()) {
                    bridgeToCross.offer(truck);
                } else if (bridgeToCross.size() == bridge_length) {
                    //다리를 건넌 큐는 bridge_length 만큼만 다리를 건널 수 있다
                    max = max - bridgeToCross.poll();
                } else {
                    //다리를 건넌 차량 + 다음 대기 차량 > weight
                    if (truck + max > weight) {
                        bridgeToCross.offer(0);
                        answer++;
                    } else {
                        bridgeToCross.offer(truck);
                        max = max + truck;
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer + max);
    }
}
