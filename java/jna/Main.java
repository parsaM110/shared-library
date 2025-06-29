// Main.java
public class Main {
    public static void main(String[] args) {
        int result = MyLib.INSTANCE.add(5, 7);
        System.out.println("Result from native lib: " + result);
    }
}

