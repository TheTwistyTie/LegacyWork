import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
Public class IsPressed{
    private static boolean wPressed = false;
    public static boolean isPressed(char x) {
        synchronized (IsKeyPressed.class) {
            return wPressed;
        }
    }
}