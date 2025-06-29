// MyLib.java
import com.sun.jna.Library;
import com.sun.jna.Native;

public interface MyLib extends Library {
    MyLib INSTANCE = Native.load("mylib", MyLib.class);
    int add(int a, int b);
}

