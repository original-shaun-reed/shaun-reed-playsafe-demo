package com.shaun.reed.playsafe.demo.controller;

import com.shaun.reed.playsafe.demo.request.KelvinRequest;
import com.shaun.reed.playsafe.demo.request.MilesRequest;
import com.shaun.reed.playsafe.demo.request.PoundsRequest;
import com.shaun.reed.playsafe.demo.response.CelsiusResponse;
import com.shaun.reed.playsafe.demo.response.KilogramsResponse;
import com.shaun.reed.playsafe.demo.response.KilometersResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConversionController {
  private static final Float CELSIUS_DEFAULT = new Float(273.15F);
  private static final Double KG_DEFAULT = new Double(0.454);
  private static final Double KM_DEFAULT =  new Double(1.60934);

  // Conversion from pounds to kelvin to celsius
  @RequestMapping(value = "/conversion/kelvinToCelsius", method = RequestMethod.POST)
  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<Object> intermediaryInfoCheck(@RequestBody KelvinRequest kelvinRequest) throws Exception {
    ErrorResponse errorResponse = new ErrorResponse();

    if (kelvinRequest != null) {
      if (kelvinRequest.getKelvin() != null) {
        Float calculation = new Float(kelvinRequest.getKelvin().floatValue() - CELSIUS_DEFAULT.floatValue());
        CelsiusResponse celsiusResponse = new CelsiusResponse();
        celsiusResponse.setCelsius(calculation);
        return ResponseEntity.ok(celsiusResponse);
      } else {
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.toString());
        errorResponse.setMessage("Bad request body, name of field in the request body should be 'kelvin' and the value should be a number");
        return ResponseEntity.ok(errorResponse);
      }
    }
    errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
    errorResponse.setMessage("Bad request body, the request body cannot be empty");
    return ResponseEntity.ok(errorResponse);
  }

  // Conversion from pounds to kilograms
  @RequestMapping(value = "/conversion/poundsToKilograms", method = RequestMethod.POST)
  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<Object> intermediaryInfoCheck(@RequestBody PoundsRequest poundsRequest) throws Exception {
    ErrorResponse errorResponse = new ErrorResponse();

    if (poundsRequest != null) {
      if (poundsRequest.getPounds() != null) {
        Double calculation = new Double(poundsRequest.getPounds().doubleValue()* KG_DEFAULT.doubleValue());
        KilogramsResponse kilogramsResponse = new KilogramsResponse();
        kilogramsResponse.setKilograms(calculation);
        return ResponseEntity.ok(kilogramsResponse);
      } else {
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.toString());
        errorResponse.setMessage("Bad request body, name of field in the request body should be 'pounds' and the value should be a number");
        return ResponseEntity.ok(errorResponse);
      }
    }
    errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
    errorResponse.setMessage("Bad request body, the request body cannot be empty");
    return ResponseEntity.ok(errorResponse);
  }

  // Conversion from miles to kilometers
  @RequestMapping(value = "/conversion/milesToKilometers", method = RequestMethod.POST)
  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<Object> intermediaryInfoCheck(@RequestBody MilesRequest milesRequest) throws Exception {
    ErrorResponse errorResponse = new ErrorResponse();

    if (milesRequest != null) {
      if (milesRequest.getMiles() != null) {
        Double calculation = new Double(milesRequest.getMiles().doubleValue() * KM_DEFAULT.doubleValue());
        KilometersResponse kilometersResponse = new KilometersResponse();
        kilometersResponse.setKilometers(calculation);
        return ResponseEntity.ok(kilometersResponse);
      } else {
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.toString());
        errorResponse.setMessage("Bad request body, name of field in the request body should be 'miles' and the value should be a number");
        return ResponseEntity.ok(errorResponse);
      }
    }
    errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
    errorResponse.setMessage("Bad request body, the request body cannot be empty");
    return ResponseEntity.ok(errorResponse);
  }
}

