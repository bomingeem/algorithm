시간 복잡도
 · 표기법으로 대문자 O를 사용한다
 · Big O Notation
 · 입력의 크기 N에 대해서 시간이 얼마나 걸릴지 나타내는 방법
 · 즉, 최악의 경우에 시간이 얼마나 걸릴지 알 수 있다
 · 시간 복잡도는 소스를 보고 계산할 수도 있고, 소스를 작성하기 전에 먼저 계산해볼 수 있다
 · 문제를 풀기 전에 먼저 생각한 방법의 시간 복잡도를 계산해보고 이게 시간 안에 수행될 것 같은 경우에만 구현하는 것이 좋다
 · 시간 복잡도 안에 가장 큰 입력 범위를 넣었을 때, 1억이 1초정도이다
 · 이 값은 대략적인 값으로, 실제로 구현해보면 1억을 조금 넘어도 1초 이내에 수행이 가능하다
 
 · Big O Notation에서 상수는 버린다
   · O(3N^2) = O(N^2)
   · O(1/2N^2) = O(N^2)
   · O(5) = O(1)
 · 두가지 항이 있을 때, 변수가 같으면 큰 것만 빼고 다 버린다
   · O(N^2 + N) = O(N^2)
   · O(N^2 + NlgN) = O(N^2)
 · 두가지 항이 있는데 변수가 다르면 놔둔다
   · O(N^2 + M)
  
메모리
 · 메모리 제한은 보통 넉넉하기 때문에 걱정할 필요가 없다
 · 보통 배열의 크기가 크면 시간 초과를 받는 경우가 많다
 · 불필요한 공간이 없다면, 대부분 메모리 제한은 알아서 지켜진다
 
입/출력
 · Java는 입력은 Scanner, 출력은 System.out을 사용한다 
   Scanner sc = new Scanner(System.in);
 · 입력이 많은 경우에는 속도가 느리기 때문에 BufferedReader를 사용한다
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 · 출력이 많은 경우에는 StringBuilder를 사용해서 한 문자열로 만들어서 출력을 한 번만 사용하거나 BufferedWriter를 사용한다

스택(Stack)
 · 스택은 한쪽 끝에서만 자료를 넣고 뺄 수 있는 자료구조
 · 마지막으로 넣은 것이 가장 먼저 나오기 때문에 LIFO(Last In First Out) 라고도 한다
 · push : 스택에 자료를 넣는 연산
 · pop : 스택에서 자료를 빼는 연산
 · top : 스택의 가장 위에 있는 자료를 보는 연산
 · empty : 스택이 비어있는지 아닌지를 알아보는 연산
 · size : 스택에 저장되어있는 자료의 개수를 알아보는 연산
스택의 구현
 · 일차원 배열 하나로 구현할 수 있다

큐(Queue)
 · 한쪽 끝에서만 자료를 넣고 다른 한쪽 끝에서만 뺄 수 있는 자료구조
 · 먼저 넣은 것이 가장 먼저 나오기 때문에 FIFO(First In First Out) 라고도 한다
 · push : 큐에 자료를 넣는 연산
 · pop : 큐에 자료를 빼는 연산
 · front : 큐의 가장 앞에 있는 자료를 보는 연산
 · back : 큐의 가장 뒤에 있는 자료를 보는 연산
 · empty : 큐가 비어있는지 아닌지를 알아보는 연산
 · size : 큐에 저장되어있는 자료의 개수를 알아보는 연산
큐의 구현
 · 일차원 배열 하나로 구현할 수 있다 (큐에 포함되어 있는 내용은 begin,end 이다)

덱(Deque)
 · 양쪽 끝에서만 자료를 넣고 양 끝에서만 뺄 수 있는 자료구조
 · push_front : 덱의 앞에 자료를 넣는 연산
 · push_back : 덱의 뒤에 자료를 넣는 연산
 · pop_front : 덱의 앞에서 자료를 빼는 연산
 · pop_back : 덱의 뒤에서 자료를 빼는 연산
 · front : 덱의 가장 앞에 있는 자료를 보는 연산
 · back : 덱의 가장 뒤에 있는 자료를 보는 연산

 