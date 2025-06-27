package ui;
import java.awt.Color;
import javax.swing.UIManager;

public class ScientificCalculator {
    public static void main(String[] args) {
        UIManager.put("Button.foreground", Color.BLACK);
        scientificcalculator.ui.CalculatorUI scientific = new scientificcalculator.ui.CalculatorUI();
        scientific.setVisible(true);
    }
}
