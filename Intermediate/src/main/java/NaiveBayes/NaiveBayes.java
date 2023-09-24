package NaiveBayes;

import org.example.IrisRecord;
import org.example.IrisRecordUtil;
import org.example.KNNClassifier;
import org.example.TextLoader;

import java.util.List;

public class NaiveBayes {
    public static void main(String [] args){
        String path = "src\\main\\resources\\iris\\iris.data";
        List<String> lines = TextLoader.getLines(path);
        List<IrisRecord> iris = lines.stream()
                .map(IrisRecordUtil::parseIris)
                .toList();
        //iris.forEach(System.out::println);

        NaiveBayesClassifier classifier = new NaiveBayesClassifier();

        iris.forEach((flower)->classifier.addDataItem(flower));

        System.out.println(
                classifier.classifyPoint(new IrisRecord(6.0,2.9,4.5,1.5,"?")));

    }
}
