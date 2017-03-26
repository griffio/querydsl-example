package entity;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

  @Test
  public void person() throws Exception {
    Person p = new Person("Bobert");
    Assert.assertNotNull(p.getFullName());
  }
}