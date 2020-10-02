package com.shaun.reed.playsafe.demo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class KilogramsResponse implements Serializable {

  @SerializedName("kilograms")
  @Expose
  private Double kilograms;

}
