package demo.jpa.converter.app;

import demo.jpa.converter.app.dto.AdvertisementConverter;
import demo.jpa.converter.app.dto.AdvertisementDto;
import demo.jpa.converter.domain.service.AdvertisementService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;

@RestController
@RequestMapping("advertisements")
@Api(value = "/advertisements", description = "Operation about advertisements")
@RequiredArgsConstructor
class AdvertisementController {

    final AdvertisementService service;
    final AdvertisementConverter converter;

    @PostMapping
    public void createAdvertisement(@RequestBody AdvertisementDto advertisement) throws MalformedURLException {
        service.createAdvertisement(converter.toEntity(advertisement));
    }

    @GetMapping("/health")
    public void healthCheck(){}
}
