package home.blackharold.access;

public class TestAccess {

    private int x = 1;
    protected int y = 11;
    public int z = 111;


    int getX() {
        return x;
    }


    public static void main(String[] args) {
        new GetAccessX().getAccess();
    }
}


class GetAccessX {
    TestAccess ta = new TestAccess();


    void getAccess() {
        System.out.println(ta.getX());
        System.out.println(ta.z);
    }
}

