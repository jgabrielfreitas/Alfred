package com.jgabrielfreitas.alfred;

import android.app.Activity;

/**
 * Created by JGabrielFreitas on 05/01/17.
 */
public class Alfred {

  private Activity target;

  private static Alfred alfred = new Alfred();

  //public static Alfred getAlfred() {
  //  return alfred;
  //}

  private Alfred() {
  }

  public static void register(Activity target) {
    this.target = target;
  }

  public static void unregister(Activity target) {
    this.target = target;
  }

}
