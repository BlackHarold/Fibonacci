package home.blackharold.enumerated;

public class TrafficLigth {
    enum Signal {
        RED, YELLOW, GREEN
    }

    static Signal color = Signal.RED;

    public static void changeColor() {
        switch (color) {
            case RED:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.RED;
        }
    }

    @Override
    public String toString() {
        return "The traffic light " + color;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        TrafficLigth tl = new TrafficLigth();

        for (int i = 0; i < 7; i++) {
            System.out.println(tl);
            t.sleep(1000);
            TrafficLigth.changeColor();
        }

    }
}
