package creational.singleton.BT4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {
    private static Election instance;

    private int donal = 0;
    private int joe = 0;
    List<String> voters = new ArrayList<>();

    private Election() {}

    public static Election Instance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public void Vote(Candidate c) {
        if (c.equals(Candidate.Donal_Trump)) {
            donal ++;
        } else {
            joe ++;
        }
    }

    public void inThongTin() {
        System.out.println("Name: " + Candidate.Donal_Trump + " count: " + donal);
        System.out.println("Name: " + Candidate.Joe_Biden + " count: " + joe);
    }
}
