package NaiveBayes;

import org.example.DataItem;

import java.util.List;

public class DataItemUtil {
    public static Double getDistance(org.example.DataItem item1, DataItem item2){
        List<Double> item1Coordinates = item1.getCoordinates();
        List<Double> item2Coordinates = item2.getCoordinates();

        double sum = 0.0;
        for (int i=0; i < item1Coordinates.size(); i++){
            Double dimensionDistance = item2Coordinates.get(i) - item1Coordinates.get(i);
            sum += dimensionDistance * dimensionDistance;
        }
        return Math.sqrt(sum);
    }
}
