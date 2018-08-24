package demo.jpa.converter.domain.model;

import demo.jpa.converter.infrastructure.converter.HtmlAdvertisementConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Advertisement {
    @Id
    private UUID id;
    @NotNull
    private Long customerId;
    @Convert(converter = HtmlAdvertisementConverter.class)
    private HtmlAdvertisement html;

}
