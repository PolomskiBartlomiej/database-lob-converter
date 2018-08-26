package demo.jpa.converter.app.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

import javax.validation.constraints.NotNull;
@Value
public class HtmlDto {

    @NotNull
    @ApiModelProperty("Header for banner")
    private String header;

    @NotNull
    @ApiModelProperty("p1 in banner")
    private String paragraph;

    @NotNull
    @ApiModelProperty("Url to banner")
    private String bannerUrl;

    @NotNull
    @ApiModelProperty("html of banner")
    private String html;
}
