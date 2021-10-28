package day04;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    List<Boolean> cells = new ArrayList<>();

    public Prison(int noOfCells) {
        for (int i = 0; i < noOfCells; i++) {
            cells.add(false);
        }
    }

    void openFreeCells() {
        for (int i = 0; i < 100; i++) {
            for (int cellIndex = 0; cellIndex < cells.size() ; cellIndex++) {
                if ((cellIndex + 1) % (i + 1) == 0) {
                    cells.set(cellIndex, !cells.get(cellIndex));
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < cells.size(); i++) {
            if (cells.get(i)) {
                if (counter > 0) {
                    sb.append(", ");
                }
                counter ++;
                sb.append(i + 1);
            }
        }
        return sb.toString();
    }
}
