package NaiveBayes;

import java.util.List;

public interface DataItem {
    public List<Double> getCoordinates();
    public String getClassifier();
}
