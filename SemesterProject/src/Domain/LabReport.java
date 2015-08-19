package Domain;

import java.sql.Date;
import java.util.ArrayList;


public class LabReport extends Document{
   
    private Date date;
    private int labReportNo=0;
    private int testType;
    private int labTechID;
    private String testName;
    private ArrayList<String> dataList = new ArrayList();


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

    

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @param labReportNo the labReportNo to set
     */
    public void setLabReportNo(int labReportNo) {
        this.labReportNo = labReportNo;
    }

    /**
     * @param testType the testType to set
     */
    public void setTestType(int testType) {
        if(testType==1)
            this.testName = "Fasting Blood Sugar";
        else if(testType==2)
            this.testName = "Urine Full Report";
        else if(testType==3)
            this.testName = "Full Blood Count";
        else if(testType==4)
            this.testName = "Serum Lipid Profile";
        else
            this.testName = "Total Cholesterol";
        this.testType = testType;
    }

    /**
     * @param labTechID the labTechID to set
     */
    public void setLabTechID(int labTechID) {
        this.labTechID = labTechID;
    }

    /**
     * @param dataList the dataList to set
     */
    public void setDataList(ArrayList<String> dataList) {
        this.dataList = dataList;
    }
    
    public void addDataToTheList(String data){
        this.dataList.add(data);
    }

    /**
     * @return the testName
     */
    public String getTestName() {
        return testName;
    }
}
