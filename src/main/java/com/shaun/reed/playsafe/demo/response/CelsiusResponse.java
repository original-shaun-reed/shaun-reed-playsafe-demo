package com.shaun.reed.playsafe.demo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class CelsiusResponse implements Serializable {

  @SerializedName("celsius")
  @Expose
  private Float celsius;

}
