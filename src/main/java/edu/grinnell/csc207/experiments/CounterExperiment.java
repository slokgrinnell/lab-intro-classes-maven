package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.Counter;

/**
 * Experiments with Counters.
 *
 * @author Slok Rajbhandari, Richard Lin
 */
public class CounterExperiment {
  /**
   * Run some experiments on counters.
   *
   * @param args
   *   Command-line arguments
   *
   * @throws Exception
   *   If something goes unexpectedly wrong
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
   
    Counter c1= new Counter();
    Counter c2= new Counter(10);
    pen.println(c1.get());
    pen.println(c2.get());
    c1.increment();
    pen.println(c1.get());
    pen.println(c2.get());
    pen.close();

  } // main(String[])
} // class CounterExperiment
