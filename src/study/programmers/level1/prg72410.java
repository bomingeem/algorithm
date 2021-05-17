package study.programmers.level1;

public class prg72410 {
    public static void main(String[] args) {
        //신규 아이디 추천
        Solution solution = new Solution();
        String new_id = "b......@";
        System.out.println(solution.solution(new_id));
    }

    static class Solution {
        public String solution(String new_id) {
            /*
            테스트 1 〉	통과 (13.90ms, 53.5MB)
            테스트 2 〉	통과 (12.96ms, 52.4MB)
            테스트 3 〉	실패 (13.04ms, 53.1MB)
            테스트 4 〉	실패 (11.90ms, 52.8MB)
            테스트 5 〉	실패 (12.96ms, 53.9MB)
            테스트 6 〉	통과 (17.66ms, 54.8MB)
            테스트 7 〉	통과 (12.19ms, 52.7MB)
            테스트 8 〉	통과 (12.99ms, 53.3MB)
            테스트 9 〉	통과 (14.67ms, 52.9MB)
            테스트 10 〉	통과 (13.05ms, 53.1MB)
            테스트 11 〉	실패 (18.04ms, 53MB)
            테스트 12 〉	실패 (21.54ms, 52.9MB)
            테스트 13 〉	통과 (13.41ms, 52.3MB)
            테스트 14 〉	통과 (15.46ms, 53.3MB)
            테스트 15 〉	실패 (13.36ms, 52.2MB)
            테스트 16 〉	통과 (16.19ms, 52.1MB)
            테스트 17 〉	통과 (13.81ms, 53.2MB)
            테스트 18 〉	통과 (18.18ms, 53.2MB)
            테스트 19 〉	실패 (18.56ms, 53.2MB)
            테스트 20 〉	실패 (15.73ms, 52.3MB)
            테스트 21 〉	실패 (20.94ms, 53.6MB)
            테스트 22 〉	통과 (14.86ms, 52.8MB)
            테스트 23 〉	통과 (22.60ms, 54.1MB)
            테스트 24 〉	통과 (17.68ms, 53.8MB)
            테스트 25 〉	통과 (17.08ms, 55MB)
            테스트 26 〉	통과 (23.68ms, 54.5MB)
            */
            String answer = "";
            //1. 대문자를 소문자로 치환
            String stage1 = new_id.toLowerCase();

            //2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
            String stage2 = "";
            for (int i=0; i<stage1.length(); i++) {
                char ch = stage1.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    stage2 += ch;
                } else if (ch >= '0' && ch <= '9') {
                    stage2 += ch;
                } else if (ch == '-' || ch == '_' || ch == '.') {
                    stage2 += ch;
                }
            }

            //3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
            String stage3 = stage2.replace("..", ".");
            while (stage3.contains("..")) {
                stage3 = stage3.replace("..", ".");
            }

            //4. 마침표(.)가 처음이나 끝에 위치한다면 제거
            String stage4 = stage3;
            if (stage4.length() > 0) {
                if (stage3.startsWith(".")) {
                    stage4 = stage3.substring(1, stage4.length());
                }
            }

            if (stage4.length() > 0) {
                if (stage3.endsWith(".")) {
                    stage4 = stage3.substring(0, stage4.length()-1);
                }
            }


            //5. 빈 문자열이라면, new_id에 "a"를 대입
            String stage5 = stage4;
            if (stage4.length() == 0) {
                stage5 += "a";
            }

            //6. 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거, 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
            String stage6 = stage5;
            if (stage5.length() >= 16) {
                stage6 = stage5.substring(0, 15);
                if (stage6.endsWith(".")) {
                    stage6 = stage6.substring(0, stage6.length()-1);
                }
            }

            //7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙이기
            StringBuilder stage7 = new StringBuilder(stage6);
            if (stage6.length() <= 2) {
                char ch = stage6.charAt(stage6.length()-1);
                while (stage7.length() < 3) {
                    stage7.append(ch);
                }
            }
            answer = String.valueOf(stage7);
            //정규표현식을 이용했을 경우
            /*
            String nickname = "";
            nickname = new_id.toLowerCase();
            nickname = nickname.replaceAll("[^-_.a-z0-9]", "");
            nickname = nickname.replaceAll("[.]{2,}", ".");
            nickname = nickname.replaceAll("^[.]|[.]$", "");
            if (nickname.length() == 0) {
                nickname += "a";
            }
            if (nickname.length() >= 16) {
                nickname = nickname.substring(0, 15);
                nickname = nickname.replaceAll("^[.]|[.]$", "");
            }
            if (nickname.length() <= 2) {
                while (nickname.length() < 3) {
                    nickname += nickname.charAt(nickname.length()-1);
                }
            }
            answer = nickname;
            */
            return answer;
        }
    }
}
