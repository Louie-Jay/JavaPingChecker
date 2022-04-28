package pingchecker;

import javax.swing.SwingUtilities;
import pingchecker.View.MainWindow;

public class PingChecker {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
    
    });
    }
    
}
