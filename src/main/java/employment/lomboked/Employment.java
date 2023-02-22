package employment.lomboked;

import employment.Job;

public class Employment {

  public static void main(String[] args) {
    //todo: As a college student you strive towards getting a better paying job. Create a person instance (yourself)
    // and apply for a suitable position in Inbank. Print out the result.
    // You may also change the code to state your current job.
    employment.Person person = new employment.Person("Priit", 28, new Job("developer"));

    System.out.println(person);
  }
}
