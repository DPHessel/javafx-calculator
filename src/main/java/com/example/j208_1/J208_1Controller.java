package com.example.j208_1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/** Controller: validates the entered numbers and performs the chosen operation. */
public class J208_1Controller {
    // The fx:id values in the FXML connect these fields to the visible text boxes.
    @FXML private TextField number1Field;
    @FXML private TextField number2Field;
    @FXML private TextField resultField;

    @FXML
    private void initialize() {
        // Prevent the user from typing over the calculated answer.
        resultField.setEditable(false);
    }

    // Both the menu items and the matching buttons call these same methods.
    @FXML private void handleAdd() { calculate('+'); }
    @FXML private void handleSubtract() { calculate('-'); }
    @FXML private void handleMultiply() { calculate('*'); }
    @FXML private void handleDivide() { calculate('/'); }

    @FXML
    private void handleExit() {
        // Close the JavaFX application when Exit is selected.
        Platform.exit();
    }

    private void calculate(char operation) {
        try {
            // Convert the text in each input box into a numeric value.
            double first = Double.parseDouble(number1Field.getText().trim());
            double second = Double.parseDouble(number2Field.getText().trim());

            // Reject special values such as NaN and Infinity.
            if (!Double.isFinite(first) || !Double.isFinite(second)) {
                showError("Enter two finite numbers.");
                return;
            }

            double answer;
            // Choose the correct arithmetic calculation.
            switch (operation) {
                case '+': answer = first + second; break;
                case '-': answer = first - second; break;
                case '*': answer = first * second; break;
                case '/':
                    if (second == 0) {
                        showError("Cannot divide by zero.");
                        return;
                    }
                    answer = first / second;
                    break;
                default: return;
            }

            if (!Double.isFinite(answer)) {
                showError("The result is too large to display.");
                return;
            }

            // Display whole-number answers without an unnecessary decimal point.
            resultField.setText(answer == Math.rint(answer)
                    ? String.format(java.util.Locale.US, "%.0f", answer)
                    : Double.toString(answer));
        } catch (NumberFormatException exception) {
            // An empty input or nonnumeric characters cannot be parsed as a number.
            showError("Please enter a valid number in both fields.");
        }
    }

    private void showError(String message) {
        // Clear the old result so an invalid calculation cannot show stale data.
        resultField.clear();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Invalid Input");
        alert.setHeaderText("Calculation could not be completed");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
