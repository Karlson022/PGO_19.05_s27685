public class StudyProgramme {
    protected String programmeName;
    protected String description;
    protected int numberOfSemesters;
    protected int maxItn;

    public StudyProgramme(String programmeName, String description, int numberOfSemesters, int maxItn) {
        this.programmeName = programmeName;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxItn = maxItn;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getMaxItn() {
        return maxItn;
    }

    public void setMaxItn(int maxItn) {
        this.maxItn = maxItn;
    }

    
 
    

}
