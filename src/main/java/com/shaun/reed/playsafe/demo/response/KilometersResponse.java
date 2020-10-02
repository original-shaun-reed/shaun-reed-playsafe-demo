package com.shaun.reed.playsafe.demo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class KilometersResponse implements Serializable {

  @SerializedName("kilometers")
  @Expose
  private Double kilometers;

}
