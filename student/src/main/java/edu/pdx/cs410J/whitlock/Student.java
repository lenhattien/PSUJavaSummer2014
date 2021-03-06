package edu.pdx.cs410J.whitlock;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
import java.util.List;
                                                                                    
/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class Student extends Human {

  public static final String USAGE = "usage: java edu.pdx.cs401J.whitlock.Student name gender age class*";
  public static final String INVALID_GPA = "GPA must be a number between 0.0 and 4.0";
  public static final String INVALID_GENDER = "Invalid gender";

  private final double gpa;
  private final List<String> classes;
  private final Gender gender;


  /*
  private final List classes;
  private double gpa;
  private String gender;
  */
  /**
   * Creates a new <code>Student</code>                                             
   *                                                                                
   * @param name                                                                    
   *        The student's name                                                      
   * @param classes                                                                 
   *        The names of the classes the student is taking.  A student              
   *        may take zero or more classes.                                          
   * @param gpa                                                                     
   *        The student's grade point average                                       
   * @param gender                                                                  
   *        The student's gender ("male" or "female", case insensitive)             
   */                                                                               
  public Student(String name,  Gender gender, double gpa, List<String> classes) {
    super(name);
    this.gpa = gpa;
    this.classes = classes;
    this.gender = gender;
  }

  /**                                                                               
   * All students say "This class is too much work"                                 
   */
  @Override
  public String says() {                                                            
    return "This class is too much work";
  }
                                                                                    
  /**                                                                               
   * Returns a <code>String</code> that describes this                              
   * <code>Student</code>.                                                          
   */                                                                               
  public String toString() {
    return this.name + " has a GPA of " + this.gpa + " and is taking " + formatClasses() + "  "
      + genderPronoun() + " says \"" + says() + "\".";
  }

  private String genderPronoun() {
    if (this.gender.equals(Gender.FEMALE)) {
      return "She";
    }else {
      return "He";
    }
  }

  private String formatClasses() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.classes.size());

    if (this.classes.size() == 1) {
      sb.append(" class");
    }else {
      sb.append(" classes");
    }

    if (this.classes.size() > 0) {
      sb.append(": ");

      for (int i = 0; i < this.classes.size(); i++) {
        sb.append(this.classes.get(i));

        if (i < this.classes.size() - 2) {
          sb.append(", ");
        }

        if (i == this.classes.size() - 2) {
          sb.append(", and ");
        }



      }

    }
    sb.append(".");
    return sb.toString();
  }


  /**
   * Main program that parses the command line, creates a
   * <code>Student</code>, and prints a description of the student to
   * standard out by invoking its <code>toString</code> method.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
      if (args.length < 3) {
        printUsageAndExit("Not enough command line arguments");
      }

    String name = args[0];
    Gender gender = validateGender(args[1]);
    double gpa = validateGpa(args[2]);

    List<String> classes = new ArrayList<>();
    for (int i = 3; i < args.length; i++) {
      classes.add(args[i]);
    }

    Student student = new Student(name, gender, gpa, classes);
    System.out.println(student.toString());
    System.exit(0);

  }

  /**
   * Validate that a gpa is a valid double. If <code>arg</code> is not a valid double,
   * the program exits with error code 1
   * @param args The string to parse
   * @return The parsed value of double
   */
  private static double validateGpa(String args) {
    double gpa;
    try {
      gpa = Double.parseDouble(args);

    } catch (NumberFormatException ex) {
      printUsageAndExit(INVALID_GPA);
      throw new AssertionError("Should never get here");
    }

    if (gpa < 0.0 || gpa > 4.0) {
      printUsageAndExit(INVALID_GPA);
      throw new AssertionError("Should never get here");
    }

    return gpa;
  }

  private static void printUsageAndExit(String errorMessage) {
    System.err.println(errorMessage);
    System.err.println();
    System.err.println(USAGE);

    System.exit(1);
  }

  private static Gender validateGender(String gender) {
    if (gender.equalsIgnoreCase("male")) {
      return Gender.MALE;
    }else if (gender.equalsIgnoreCase("female")) {
      return Gender.FEMALE;
    }else {
      printUsageAndExit(INVALID_GENDER);
      throw new AssertionError("Should not get here");
    }
  }

  public enum Gender {
    MALE, FEMALE
  }

}