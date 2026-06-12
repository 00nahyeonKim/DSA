package chap04;

public class IntStack {

    private int[] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    // 실행 시 예외: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { } // "이런 종류의 예외가 발생했다"는 이름표 역할만
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { } // "이런 종류의 예외가 발생했다"는 이름표 역할만
    }

    // 생성자
    public IntStack(int maxlen) {

        ptr = 0;
        capacity = maxlen;

        try {
            stk = new int[capacity]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    //  스택에 x를 푸쉬
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) 
            throw new EmptyIntStackException();
        return stk[--ptr];
    }
}
