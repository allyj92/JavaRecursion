public class PlusFunction {

    public static void main(String[] args) {
        HelloWorld(5);
    }

    public static void HelloWorld(int n){
        if(n==0)
            return;

        System.out.print("Hello World\n");
        HelloWorld(n-1);
    }

}
