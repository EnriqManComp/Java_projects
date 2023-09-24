package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class KNN {
    public static void main(String [] args){
        String path = "src\\main\\resources\\iris\\iris.data";
        List<String> lines = TextLoader.getLines(path);
        List<IrisRecord> iris = lines.stream()
                .map(IrisRecordUtil::parseIris)
                .toList();
        //iris.forEach(System.out::println);

        KNNClassifier classifier = new KNNClassifier();

        iris.forEach((flower)->classifier.addDataItem(flower));

        System.out.println(
                classifier.classifyPoint(new IrisRecord(0.1,0.2,0.3,0.4,"?"),5));

    }
}
