package demo.jpa.converter.domain.model;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.net.URI;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HtmlAdvertisement {
    @NotNull
    private String header;
    @NotNull
    private String paragrahp;
    @NotNull
    private URI banner;
    @NotNull
    private String html;
}
