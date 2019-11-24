package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student  {
    private List<Lab> lablist = new ArrayList<>();
    LabStatus labStatus;


    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {


    }

    public Lab getLab(String labName) {
        Lab lab1 = null;
        for (Lab lab : lablist) {
            if (lab.getName().equals(labName)) {
                lab1 = lab;
            }
        }
        return lab1;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (this.getLab(labName) == (null)) {
            throw new UnsupportedOperationException();

        } else {
            Lab lab = this.getLab(labName);
            lab.labStatus = labStatus;
        }

    }

    public void forkLab(Lab lab) {
        lab.setStatus(labStatus.PENDING);
        lablist.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab2 = this.getLab(labName);


        return lab2.getStatus();
    }

    @Override
    public String toString() {


        String listoflabs = "";
        for (Lab lab : lablist) {
            listoflabs += lab.getName() + " > " + lab.getStatus() + "\n";
        }
        String[]labArr = listoflabs.split("\n");
        listoflabs = labArr[1] + "\n" + labArr[0];
        return listoflabs;
    }


}
