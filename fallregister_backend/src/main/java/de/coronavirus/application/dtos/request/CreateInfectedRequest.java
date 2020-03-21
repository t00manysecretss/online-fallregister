package de.coronavirus.application.dtos.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@ApiModel("CreateInfectedRequest")
public class CreateInfectedRequest {

    /* Entity */
    @NotEmpty
    @ApiModelProperty
    List<String> phoneNumber;

    /* -Address */
    @NotNull
    @ApiModelProperty
    Integer infectedHouseNumber;

    /* --Street */
    @NotEmpty
    @ApiModelProperty
    String infectedStreetName;

    /* ---PostCode */
    @NotNull
    @ApiModelProperty
    long infectedPostCode;

    @NotEmpty
    @ApiModelProperty
    String infectedCityName;

    @NotEmpty
    @ApiModelProperty
    String infectedCounty;

    /* Infected */
    @NotEmpty
    @ApiModelProperty
    String firstName;

    @NotEmpty
    @ApiModelProperty
    String lastName;

    @NotNull
    @ApiModelProperty
    String gender;

    @NotNull
    @ApiModelProperty
    Date dateOfBirth;

    @ApiModelProperty
    List<String> jobs;

    /* -Accommodation */
    @ApiModelProperty
    String accommodationName;

    /* -Diagnosis */
    @NotEmpty
    @ApiModelProperty
    String diagnosisResult;

    @NotNull
    @ApiModelProperty
    Date diagnosisDate;

    /* --Detector */
    @NotEmpty
    @ApiModelProperty
    String detectorName;

    /* --Laboratory */
    @NotEmpty
    @ApiModelProperty
    String laboratoryName;

    @NotNull
    @ApiModelProperty
    boolean diagnosisConfirmed;

    @ApiModelProperty
    Date dateOfIllness;

    @ApiModelProperty
    Date dateOfDeath;

    @ApiModelProperty
    String infectionSource;

    @ApiModelProperty
    boolean intensiveCareTreatment;
}