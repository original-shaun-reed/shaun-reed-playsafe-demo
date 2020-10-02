package com.shaun.reed.playsafe.demo.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class PoundsRequest implements Serializable {

  @SerializedName("pounds")
  @Expose
  private Double pounds;

}
