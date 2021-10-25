package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    List<Integer> heightList = new ArrayList<>();

    public void addHeight(int height) {
        heightList.add(height);
    }

    public boolean isHeightIncreasing() {
        boolean increasing = true;
        int max = 0;
        for (int i = 0; i < heightList.size(); i++) {
            int actValue = heightList.get(i);
            if (actValue < max)
                increasing = false;
            else max = actValue;
        }
        return increasing;
    }
}
