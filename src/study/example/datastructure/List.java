package study.example.datastructure;

public interface List<E> {
    /**
     * 리스트에 요소를 추가
     */
    boolean add(E value);

    /**
     * 리스트에 요소를 특정 위치에 추가
     */
    void add(int index, E value);

    /**
     * 리스트에서 특정 요소를 삭제
     * 동일한 요소가 여러개일 경우 가장 처음 발견한 요소만 삭제
     */
    boolean remove(Object value);

    /**
     * 리스트의 index 위치에 있는 요소 삭제
     */
    E remove(int index);

    /**
     * 리스트에 있는 특정 위치의 요소를 반환
     */
    E get(int index);

    /**
     * 리스트에서 특정 위치에 있는 요소를 새 요소로 대체
     */
    void set(int index, E value);

    /**
     * 리스트에 특정 요소가 리스트에 있는지 여부를 확인
     */
    boolean contains(Object value);

    /**
     * 리스트에 특정 요소가 몇 번째 위치에 있는지 반환
     */
    int indexOf(Object value);

    /**
     * 리스트에 있는 요소의 개수 반환
     */
    int size();

    /**
     * 리스트에 요소가 비어있는지 반환
     */
    boolean isEmpty();

    /**
     * 리스트에 있는 요소를 모두 삭제
     */
    void clear();
}
