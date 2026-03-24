package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<FroggerID> records; 

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(FroggerID froggerId) {
        if (records.contains(froggerId)) {  
            return false;
        }
        records.add(froggerId);
        return true;
    }
}