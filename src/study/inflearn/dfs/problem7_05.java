package study.inflearn.dfs;

public class problem7_05 {
    Node root;

    public void DFS(Node root) {
        //이진트리 순회(깊이 우선 탐색)
        if (root == null) {
            return;
        } else {
            //System.out.print(root.data + " "); // 전위순회
            DFS(root.lt);
            //System.out.print(root.data + " "); //중위순회
            DFS(root.rt);
            System.out.print(root.data + " "); //후위순회
        }
    }

    public static void main(String[] args) {
        //말단 노드의 lt, rt값은 null이다
        //전위: 부모 - 왼쪽 - 오른쪽
        //중위: 왼쪽 - 부모 - 오른쪽
        //후위: 왼쪽 - 오른쪽 - 부모
        problem7_05 tree = new problem7_05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root); //100번지 1번노드
    }
}

class Node {
    int data;
    //Node 클래스의 주소를 저장하는 Left, Right
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
