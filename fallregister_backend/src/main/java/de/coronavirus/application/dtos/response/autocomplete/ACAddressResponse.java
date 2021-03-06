package de.coronavirus.application.dtos.response.autocomplete;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Autocomplete Address Response")
public class ACAddressResponse {

    @ApiModelProperty
    String countryName;

    @ApiModelProperty
    String cityName;

    @ApiModelProperty
    long postCode;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPostCode() {
        return postCode;
    }

    public void setPostCode(long postCode) {
        this.postCode = postCode;
    }
}
