public class Traffic {
    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case green -> System.out.println("Green means GO, NOW GO!");
            case yellow -> System.out.println("Woah there, slow down partner");
            case red -> System.out.println("NO COP, NO STOP!");
        }
    }

    public static void main(String[] args) {
        makeDrivingDecision(TrafficLightColor.green);
        makeDrivingDecision(TrafficLightColor.yellow);
        makeDrivingDecision(TrafficLightColor.red);
    }
}
