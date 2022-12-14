package lk.ijse.sipsewana.util;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

public class ValidationUtil {
    public static Object validate(LinkedHashMap<TextField, Pattern> map, Button btn) {
        btn.setDisable(true);
        for (TextField textFieldKey : map.keySet()) {
            Pattern patternValue = map.get(textFieldKey);
            if (!patternValue.matcher(textFieldKey.getText()).matches()) {
                if (!textFieldKey.getText().isEmpty()) {
                    textFieldKey.setStyle("-fx-text-fill: red");
                    ((AnchorPane) textFieldKey.getParent()).getChildren().get(1).setStyle("-fx-text-fill: red");
                }
                return textFieldKey;
            }
            textFieldKey.setStyle("-fx-text-fill: green");
            ((AnchorPane) textFieldKey.getParent()).getChildren().get(1).setStyle("-fx-text-fill: green");
        }
        btn.setDisable(false);
        return true;
    }
}
