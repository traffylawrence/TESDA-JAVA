import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    // Components
    private JTextField display;
    private JButton[] digitButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    // Variables
    private StringBuilder currentInput;
    private String lastOperator;
    private double result;

    public Calculator() {
        // Frame display
        setTitle("Simple Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create components
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create button panels
        JPanel digitPanel = new JPanel(new GridLayout(4, 3));
        JPanel operatorPanel = new JPanel(new GridLayout(4, 1));

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].addActionListener(this);
            digitPanel.add(digitButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.addActionListener(this);
            operatorPanel.add(button);
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        clearButton = new JButton("C");
        clearButton.addActionListener(this);

        // Add components to frame
        add(digitPanel, BorderLayout.CENTER);
        add(operatorPanel, BorderLayout.EAST);
        add(equalsButton, BorderLayout.SOUTH);
        add(clearButton, BorderLayout.WEST);

        // Initialize variables
        currentInput = new StringBuilder();
        lastOperator = "";
        result = 0.0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String command = source.getText();

        // Handle digit buttons
        for (int i = 0; i < 10; i++) {
            if (source == digitButtons[i]) {
                currentInput.append(i);
                display.setText(currentInput.toString());
                return;
            }
        }

        // Handle operator buttons
        for (JButton button : operatorButtons) {
            if (source == button) {
                performOperation();
                lastOperator = command;
                currentInput = new StringBuilder();
                return;
            }
        }

        // Handle equals button
        if (source == equalsButton) {
            performOperation();
            lastOperator = "";
            return;
        }

        // Handle clear button
        if (source == clearButton) {
            currentInput = new StringBuilder();
            lastOperator = "";
            result = 0.0;
            display.setText("");
        }
    }

    private void performOperation() {
        if (currentInput.length() > 0) {
            double currentNumber = Double.parseDouble(currentInput.toString());
            switch (lastOperator) {
                case "+":
                    result += currentNumber;
                    break;
                case "-":
                    result -= currentNumber;
                    break;
                case "*":
                    result *= currentNumber;
                    break;
                case "/":
                    if (currentNumber != 0) {
                        result /= currentNumber;
                    } else {
                        display.setText("Error");
                        currentInput = new StringBuilder();
                        lastOperator = "";
                        result = 0.0;
                        return;
                    }
                    break;
                default:
                    result = currentNumber;
                    break;
            }
            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
