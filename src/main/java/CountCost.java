import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class CountCost {
    private int multiplierForVertical = 1;
    private int multiplierForHorizontal = 1;
    private int horizontalMax;
    private int verticalMax;
    private LoadData loadData = new LoadData();
    private int result = 0;

    public void count() {

        loadData.loadData();
        ArrayList<Integer> horizontalArList = loadData.loadHorizontalCutsCost();
        ArrayList<Integer> verticalArList = loadData.loadVerticalCutCost();


        while (!(horizontalArList.isEmpty() && verticalArList.isEmpty())) {
            if (!horizontalArList.isEmpty()) {
                horizontalMax = Collections.max(horizontalArList);
            } else {
                horizontalMax = -1;
            }
            if (!verticalArList.isEmpty()) {
                verticalMax = Collections.max(verticalArList);
            } else {
                verticalMax = -1;
            }

            if (horizontalMax >= verticalMax) {
                result = result + horizontalMax * multiplierForHorizontal;
                multiplierForVertical++;
                horizontalArList.remove(Collections.max(horizontalArList));
            } else {
                result = result + verticalMax * multiplierForVertical;
                multiplierForHorizontal++;
                verticalArList.remove(Collections.max(verticalArList));
            }
        }
        System.out.println(result);
    }
}