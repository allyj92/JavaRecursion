//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void methodThree(){
        System.out.print("Three");
    }

    public static void methodTwo(){
        methodThree();
        System.out.print("Two");
    }

    public  static void methodOne(){
        methodTwo();
        System.out.print("One");
    }


    public static void main(String[] args) {
        methodOne();
    }
}