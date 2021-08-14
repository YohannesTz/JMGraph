package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> functionTypes;

    @FXML
    private LineChart<Double, Double> mathChart;

    @FXML
    private Button showButton;

    @FXML
    private Button clearButton;

    private String[] types = {"Linear", "Quadratic", "Cubic", "Power", "Exponential", "Logarithmic"};
    private GraphHelper graphHelper;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showButton.setOnAction(e -> getChoice(functionTypes));
        mathChart.setCreateSymbols(false);
        mathChart.getStyleClass().add("thick-chart");
        graphHelper = new GraphHelper(mathChart, 10);
        clearButton.setOnAction(e -> graphHelper.clear());
    }



    private void getChoice(ChoiceBox<String> functionTypes) {
        String function = functionTypes.getValue();
        System.out.println(function);



        switch (function) {
            case "Linear":
                graphHelper.plotLine(x -> x + 2, function);
                break;
            case "Quadratic":
                graphHelper.plotLine(x -> Math.pow(x, 2), function);
                break;
            case "Cubic":
                graphHelper.plotLine(x -> Math.pow(x, 3), function);
                break;
            case "Power":
                graphHelper.plotLine(x -> Math.pow(7, x), function);
                break;
            case "Exponential":
                graphHelper.plotLine(x -> Math.pow(Math.E, x) , function);
                break;
            case "Logarithmic":
                graphHelper.plotLine(Math::log, function);
                break;
            case "Square":
                graphHelper.plotLine(Math::sqrt, function);
                break;
            default:
        }
    }

}
