package com.shaun.reed.playsafe.demo.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class MilesRequest implements Serializable {

  @SerializedName("miles")
  @Expose
  private Double miles;

}
