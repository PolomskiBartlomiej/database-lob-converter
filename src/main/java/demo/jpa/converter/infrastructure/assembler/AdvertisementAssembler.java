package demo.jpa.converter.infrastructure.assembler;

import com.google.common.base.Preconditions;
import demo.jpa.converter.app.dto.AdvertisementConverter;
import demo.jpa.converter.app.dto.AdvertisementDto;
import demo.jpa.converter.app.dto.HtmlDto;
import demo.jpa.converter.domain.model.Advertisement;
import demo.jpa.converter.domain.model.HtmlAdvertisement;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

@Component
class AdvertisementAssembler implements AdvertisementConverter {

    @Override
    public Advertisement toEntity(@NonNull AdvertisementDto dto) throws MalformedURLException {
        HtmlDto html = Preconditions.checkNotNull(dto.getHtml());

        HtmlAdvertisement htmlAdvertisement = HtmlAdvertisement.builder()
                .paragraph(html.getParagraph())
                .header(html.getHeader())
                .bannerUrl(new URL(html.getBannerUrl()))
                .build();


        return Advertisement.builder()
               .id(UUID.randomUUID())
               .customerId(dto.getCustomerId())
               .html(htmlAdvertisement)
               .build();
    }
}
