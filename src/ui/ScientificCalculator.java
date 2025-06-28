package ui;
import java.awt.Color;
import javax.swing.UIManager;

public class ScientificCalculator {
    public static void main(String[] args) {
        UIManager.put("Button.foreground", Color.BLACK);
        ui.CalculatorUI scientific = new ui.CalculatorUI();
        scientific.setVisible(true);
    }
}
