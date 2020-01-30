package edu.pdx.cs410J.sytov;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class KataIT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain( Kata.class, args );
  }

  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
    MainMethodResult result = invokeMain();
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  public void testKataAcceptsCharAsInput() {
    String[] args = new String[]{"A"};
    MainMethodResult result = invokeMain(args);
    assertThat(result.getExitCode(), equalTo(0));

  }

  @Test
  public void testKataRejectsMultipleChars() {
    String[] args = new String[]{"A", "B"};
    MainMethodResult result = invokeMain(args);
    assertThat(result.getExitCode(), equalTo(1));
    assertThat(result.getTextWrittenToStandardError(), containsString("To many command line arguments"));
  }

  @Test
  public void testKataRejectsLongString() {
    String[] args = new String[]{"Abacadabra"};
    MainMethodResult result = invokeMain(args);
    assertThat(result.getExitCode(), equalTo(1));
    assertThat(result.getTextWrittenToStandardError(), containsString("The String has to contain only 1 character"));
  }

  @Test
  public void testKataRejectsInvalidStrings() {
    String[] args = new String[]{"1"};
    MainMethodResult result = invokeMain(args);
    assertThat(result.getExitCode(), equalTo(1));
    assertThat(result.getTextWrittenToStandardError(), containsString("You have to provide an alphabetical character as the input"));
  }
}
