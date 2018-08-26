package demo.jpa.converter.app.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Value
public class AdvertisementDto {

    @ApiModelProperty(value = "customerId", required = true)
    @NotNull
    private Long customerId;

    @ApiModelProperty("advertisementHTML")
    @NotNull
    @Valid
    private HtmlDto html;

}
