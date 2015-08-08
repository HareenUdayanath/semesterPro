package Domain;

import java.sql.Date;
import java.util.ArrayList;


public class LabReport extends Document{
    private int PID;
    private Date date;
    private int labReportNo;
    private int testType;
    private int labTechID;
;
    private ArrayList<String> dataList = new ArrayList();

    /**
     * @return the PID
     */
    public int getPID() {
        return PID;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the labReportNo
     */
    public int getLabReportNo() {
        return labReportNo;
    }

    /**
     * @return the testType
     */
    public int getTestType() {
        return testType;
    }

    /**
     * @return the labTechID
     */
    public int getLabTechID() {
        return labTechID;
    }

    /**
     * @return the dataList
     */
    public ArrayList<String> getDataList() {
        return dataList;
    }
}
