package employment;

public class Person {

  private String name;
  private Integer age;
  private Job job;

  public Person(String name, Integer age, Job job) {
    this.name = name;
    this.age = age;
    this.job = job;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", job=" + job +
        '}';
  }
}
