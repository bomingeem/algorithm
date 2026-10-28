package study.programmers.level1;

public class prg172928 {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String[] splitRoute = route.split(" ");
            String direction = splitRoute[0];
            Integer distance = Integer.valueOf(splitRoute[1]);

            int nx = x;
            int ny = y;
            boolean canMove = true;
            for (int i = 0; i < distance; i++) {
                if (direction.equals("E")) {
                    ny++;
                } else if (direction.equals("W")) {
                    ny--;
                } else if (direction.equals("S")) {
                    nx++;
                } else if (direction.equals("N")) {
                    nx--;
                }

                if (nx >= 0 && ny >= 0 && nx < park.length && ny < park[0].length()) {
                    if (park[nx].charAt(ny) == 'X') {
                        canMove = false;
                        break;
                    }
                } else {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                x = nx;
                y = ny;
            }
        }
        return new int[]{x, y};
    }
}
