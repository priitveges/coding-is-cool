package employment.lomboked;

import employment.Job;
import lombok.Value;

@Value
public class Person {

  String name;
  Integer age;
  Job job;
}
