public class Performance {
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    public Performance(String performanceID,String performanceName,String performanceLeadName){
        this.performanceID=performanceID;
        this.performanceName=performanceName;
        this.performanceLeadName=performanceLeadName;
    }
    public void setPerformanceID(String performanceID){
        this.performanceID=performanceID;
    }
    public String getPerformanceID(){
        return performanceID;
    }
    public void setPerformanceName(String performanceName){
        this.performanceName=performanceName;
    }
    public String getPerformanceName(){
        return performanceName;
    }
    public void setPerformanceLeadName(String performanceLeadName){
        this.performanceLeadName=performanceLeadName;
    }
    public String getPerformanceLeadName(){
        return performanceLeadName;
    }
    public String ToString(){
        return"Performance{PerformanceID='"+performanceID+"',PerformanceName='"+performanceName+"',PerformanceLeadName='"+performanceLeadName+"'}";
    }
}
