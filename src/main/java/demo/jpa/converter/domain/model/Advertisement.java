package demo.jpa.converter.domain.model;

import demo.jpa.converter.infrastructure.converter.HtmlAdvertisementConverter;
import lombok.*;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode(of = "id")
@ToString
public class Advertisement {

    @Id
    private UUID id;

    @NotNull
    private Long customerId;

    @Convert(converter = HtmlAdvertisementConverter.class)
    @Lob
    private HtmlAdvertisement html;

}
