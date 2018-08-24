package demo.jpa.converter.app;

import demo.jpa.converter.domain.model.Advertisement;
import demo.jpa.converter.domain.model.HtmlAdvertisement;
import demo.jpa.converter.domain.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("advertisements")
@RequiredArgsConstructor
class AdvertisementController {

    final AdvertisementService service;

    @PostMapping
    public void createAdvertisement(@RequestBody Advertisement advertisement) {
        Advertisement.builder()
                .id(UUID.randomUUID())
                .customerId(0L)
                .html(new HtmlAdvertisement("asda","asdad",URI.create("www.image.pl"),"asdasd"));
        service.createAdvertisement(advertisement);
    }
}
