package sample;

import javafx.scene.chart.XYChart;

import java.util.function.Function;

public class GraphHelper {

    private XYChart<Double, Double> graph;
    private double range;

    public GraphHelper(XYChart<Double, Double> graph, double range) {
        this.graph = graph;
        this.range = range;
    }

    public void plotLine(final Function<Double, Double> function, String name) {
        final XYChart.Series<Double, Double> series = new XYChart.Series<Double, Double>();
        series.setName(name);
        for (double x = -range; x <= range; x = x + 0.05) {
            plotPoint(x, function.apply(x), series);
        }
        graph.getData().add(series);
    }

    private void plotPoint(final double x, final double y,
                           final XYChart.Series<Double, Double> series) {
        series.getData().add(new XYChart.Data<Double, Double>(x, y));
    }

    public void clear() {
        graph.getData().clear();
    }

}
