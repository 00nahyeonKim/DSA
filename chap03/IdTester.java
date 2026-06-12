package chap03;

class Id {
    private static int counter = 0; // 아이디를 몇 개 부여했는지 저장 - 클래스 변수
    private int id; // 아이디 - 인스턴스 변수

    public Id() { id = ++counter; } // 생성자

    public static int getCounter() { return counter; } // 클래스 메서드

    public int getId() { return id;} // 인스턴스 메서드
}

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수: " + Id.getCounter());
    }
}
