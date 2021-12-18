package pacman;

import com.sun.opengl.util.*;
import java.awt.*;
import javax.media.opengl.*;
import javax.swing.*;

public class PACMAN extends JFrame {
    GLCanvas glcanvas = new GLCanvas();
    Animator animator = new FPSAnimator(120);
    AnimListener listener = new AnimGLEventListener();

    public static void main(String[] args) {
        new PACMAN().animator.start();
    }

    public PACMAN() {
        glcanvas.addGLEventListener(listener);
        glcanvas.addKeyListener(listener);
        animator.add(glcanvas);
        getContentPane().add(glcanvas, BorderLayout.CENTER);

        setTitle("PAC-MAN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 850);
        setLocationRelativeTo(null);
        setVisible(true);
        setFocusable(true);
        glcanvas.requestFocus();
    }
}
