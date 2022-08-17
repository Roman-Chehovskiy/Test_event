package employees;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employees {

    public List<Woker> wokerList;

    public Manager() {
        wokerList = new ArrayList<>();
    }

    public void addWoker(Woker woker) {
        wokerList.add(woker);
    }
}
