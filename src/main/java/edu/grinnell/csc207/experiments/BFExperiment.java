package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BigFraction;

/**
 * A simple experiment using fractions.
 *
 * @author Samuel A. Rebelsky.
 * @author Slok Rajbhandari, Richard Lin
 */
public class BFExperiment {
  /**
   * Generate a few fractions and print them out.
   *
   * @param args
   *   Command-line arguments; ignored.
   *
   * @throws Exception
   *   When we have some unexpected I/O issue.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BigFraction f1;
    f1 = new BigFraction(3, 10);
    BigFraction f2;
    f2 = new BigFraction(2, 5);
    pen.println("First fraction: " + f1);
    pen.println("Second fraction: " + f2);
    pen.println("Sum: " + (f1.add(f2)));


    BigFraction f3 = new BigFraction(3,7);
    BigFraction f4 = new BigFraction(4,9);

    pen.println(BigFraction.multiply(f3,f4));

    BigFraction f5 = new BigFraction(14,3);
    pen.println(f5.fractional());

    BigFraction f6 = new BigFraction("6/7");
    pen.println(f6.fractional());

    


    pen.close();
  } // main(String[])
} // class BFExperiment
