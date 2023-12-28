public class Demo {
    
    static int a;
    int b;

    int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        int value = obj.add(3, 45);
        System.out.println(value);
        if(true) {
            int sad = 0;
        }
        Demo.a;
        System.out.println(sad);
    }

    static {
        System.out.println("sdassd");
    }

    public void msdksdfs() {

    }
}
