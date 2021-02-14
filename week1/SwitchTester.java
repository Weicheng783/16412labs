class SwitchTester {
    public static void main(String args[]) {
        short a = 8;
        byte b = 8;
        switchExperiment(a, b);
        System.out.println(((Object)a).getClass().getName());
        System.out.println(((Object)b).getClass().getName());
    }
    public static void switchExperiment(int a, int b) {
        switch (a) {
            case 1:
                b -= 4;
            case 2:
                b += 4;
            case 3:
                b /= 4;
                break;
            case 4:
                b *= 4;
                break;
            default:
                b = 0;
                break;
        }
        System.out.println("b is " + b);
    }
}
