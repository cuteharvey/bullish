package com.bullish.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FetchStudentResponse {

    @JsonProperty("data")
    private FetchStudentRequest student;




}
