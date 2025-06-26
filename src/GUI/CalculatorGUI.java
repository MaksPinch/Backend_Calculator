package GUI;

import operations.CalculationLogic;
import operations.TrigonometricOperation;
import operations.LogarithmicOperation;
import exception.CalculatorException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame {
    private JTextField inputField;
    private String firstValue = "";
    private String operator = "";
    private boolean waitingForSecondValue = false;
    private CalculationLogic logic = new CalculationLogic();

    public CalculatorGUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 500);
        setLocationRelativeTo(null);

        inputField = new JTextField();
        inputField.setEditable(true); // Allow typing
        inputField.setFont(new Font("Arial", Font.BOLD, 24));
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 5, 5));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "sin", "cos", "tan",
                "ln", "log"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(e -> onButtonClick(text));
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void onButtonClick(String text) {
        // Numbers and dot
        if (text.equals("0") || text.equals("1") || text.equals("2") || text.equals("3") ||
                text.equals("4") || text.equals("5") || text.equals("6") || text.equals("7") ||
                text.equals("8") || text.equals("9") || text.equals(".")) {
            inputField.setText(inputField.getText() + text);
        }
        // Operators
        else if (text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")) {
            if (!inputField.getText().isEmpty()) {
                firstValue = inputField.getText();
                operator = text;
                inputField.setText(""); // Clear for second value
            }
        }
        // Equals
        else if (text.equals("=")) {
            if (!firstValue.isEmpty() && !operator.isEmpty() && !inputField.getText().isEmpty()) {
                double a = Double.parseDouble(firstValue);
                double b = Double.parseDouble(inputField.getText());
                double result = 0;
                try {
                    if (operator.equals("+")) result = logic.addition(a, b);
                    if (operator.equals("-")) result = logic.subtraction(a, b);
                    if (operator.equals("*")) result = logic.multiplication(a, b);
                    if (operator.equals("/")) result = logic.division(a, b);
                    inputField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    inputField.setText("Error");
                }
                firstValue = "";
                operator = "";
            }
        }
        // Clear
        else if (text.equals("C")) {
            inputField.setText("");
            firstValue = "";
            operator = "";
        }
        // Trigonometric
        else if (text.equals("sin") || text.equals("cos") || text.equals("tan")) {
            if (!inputField.getText().isEmpty()) {
                try {
                    double value = Double.parseDouble(inputField.getText());
                    TrigonometricOperation op = new TrigonometricOperation(value, text, false);
                    double result = op.calculate();
                    inputField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    inputField.setText("Error");
                }
            }
        }
        // Logarithmic
        else if (text.equals("ln") || text.equals("log")) {
            if (!inputField.getText().isEmpty()) {
                try {
                    double value = Double.parseDouble(inputField.getText());
                    LogarithmicOperation op = new LogarithmicOperation(value, text);
                    double result = op.calculate();
                    inputField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    inputField.setText("Error");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI::new);
    }
}