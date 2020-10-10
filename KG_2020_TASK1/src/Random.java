public class Random {
    public static int interval(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
