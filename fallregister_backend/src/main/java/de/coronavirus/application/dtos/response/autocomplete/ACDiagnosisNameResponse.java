package de.coronavirus.application.dtos.response.autocomplete;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("Autocompletet Diagnosis Name Response")
public class ACDiagnosisNameResponse {

    @ApiModelProperty
    List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
