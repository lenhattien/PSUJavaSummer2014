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

  private final List classes;
  private double gpa;
  private String gender;

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
  public Student(String name, ArrayList classes, double gpa, String gender) {
    super(name);

    this.classes = classes;
    this.gpa = gpa;
    this.gender = gender;
  }

  /**                                                                               
   * All students say "This class is too much work"                                 
   */
  @Override
  public String says() {                                                            
    return "This class is too much work" ;
  }
                                                                                    
  /**                                                                               
   * Returns a <code>String</code> that describes this                              
   * <code>Student</code>.                                                          
   */                                                                               
  public String toString() {
    return getName() + " has a GPA of " + getGpa() + " and is taking " + this.classes.size() +
      " classes: " + formatClasses() + ". " + getGenderPronoun() + " says \"" + says() + "\".";
  }

  private String formatClasses() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < this.classes.size(); i++) {
      sb.append(this.classes.get(i));
      if (i < this.classes.size() - 1) {
        sb.append(", ");
      }

      if (i == this.classes.size() - 2) {
        sb.append("and ");
      }
    }
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
    String gender = validateGender(args[1]);
    double gpa = validateGpa(args[2]);

    ArrayList<String> classes = new ArrayList<>();
    for (int i = 3; i < args.length; i++) {
      classes.add(args[i]);
    }

    Student student = new Student(name, classes, gpa, gender);
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

  private static String validateGender(String gender) {
    if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
      printUsageAndExit(INVALID_GENDER);
    }

    return gender;
  }

  public double getGpa() {
    return gpa;
  }

  public String getGenderPronoun() {
    if (gender.equalsIgnoreCase("male")) {
      return "He";
    }else {
      return "She";
    }
  }
}