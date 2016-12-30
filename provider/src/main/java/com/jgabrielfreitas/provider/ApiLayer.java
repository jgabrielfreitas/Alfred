package com.jgabrielfreitas.provider;

/**
 * Created by JGabrielFreitas on 30/12/16.
 */

public abstract class ApiLayer {

  private String baseUrl;

  public ApiLayer(String baseUrl) {
    this.baseUrl = baseUrl;
  }
}
