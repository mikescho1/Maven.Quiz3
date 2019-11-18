package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> lablist;



    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.lablist = labs;

    }

    public Lab getLab(String labName) {

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
