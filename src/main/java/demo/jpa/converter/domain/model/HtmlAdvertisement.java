package demo.jpa.converter.domain.model;


import lombok.*;

import javax.validation.constraints.NotNull;
import java.net.URI;
import java.net.URL;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@EqualsAndHashCode
@ToString
public class HtmlAdvertisement {

    @NotNull
    private String header;

    @NotNull
    private String paragraph;

    @NotNull
    private URL bannerUrl;

    @NotNull
    private String html;
}
