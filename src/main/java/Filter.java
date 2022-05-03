import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int e : source) {
            if (e < threshold) {
                logger.log("Элемент " + e + " не проходит");
            } else {
                result.add(e);
                logger.log("Элемент " + e + " проходит");
            }
        }
        return result;
    }
}
