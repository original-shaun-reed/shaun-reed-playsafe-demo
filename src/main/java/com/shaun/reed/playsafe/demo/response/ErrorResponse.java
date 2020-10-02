package com.shaun.reed.playsafe.demo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class ErrorResponse implements Serializable {

  @SerializedName("status")
  @Expose
  private String status;

  @SerializedName("kilometers")
  @Expose
  private String message;

}
