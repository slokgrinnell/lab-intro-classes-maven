package edu.grinnell.csc207.util;

import java.math.BigInteger;

/**
 * Simple counters.
 *
 * Slok Rajbhandari, Richard Lin
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

    int counter;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  public Counter() {
    this.counter = 0;
  } //Counter()

  public Counter(int n) {
    this.counter = n;
  } //Counter()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  public void increment(){
    this.counter ++;
  }

  public int get(){
    return this.counter;
  }

} // class Counter
