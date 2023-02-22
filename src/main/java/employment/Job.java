package employment;

public class Job {

  private String employerName = "Inbank";
  private String title;

  public Job(String title) {
    this.title = title;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }

  @Override
  public String toString() {
    return "Job{" +
        "employerName='" + employerName + '\'' +
        ", title='" + title + '\'' +
        '}';
  }
}
