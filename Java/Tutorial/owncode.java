public class owncode {
    
    int findAverage(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        owncode obj = new owncode();
        int avgValue = obj.findAverage(3, 6 , 9);
        System.out.println(avgValue);
    }
}
