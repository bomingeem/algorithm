package study.example.datastructure.interface_form;

public interface StackInterface<E> {
    /**
     * 스택의 맨 위에 요소 추가
     */
    E push(E item);

    /**
     * 스택의 맨 위에 요소 제거 후 제거된 요소 반환
     */
    E pop();

    /**
     * 스택의 맨 위에 요소 반환
     */
    E peek();

    /**
     * 스택의 상단부터 특정 요소가 몇 번째 위치에 있는지 반환
     * 중복되는 원소가 있을경우 가장 위에 있는 요소의 위치가 반환
     */
    int search(Object value);

    /**
     * 스택에 요소 개수 반환
     */
    int size();

    /**
     * 스택에 모든 요소 삭제
     */
    void clear();

    /**
     * 스택에 요소가 비어있는지 확인
     */
    boolean empty();
}
