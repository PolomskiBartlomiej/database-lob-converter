package demo.jpa.converter.domain.service;

import demo.jpa.converter.domain.model.Advertisement;
import demo.jpa.converter.infrastructure.repository.AdvertisementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;

    public void createAdvertisement(Advertisement advertisement) {
        log.info(advertisement.toString());
        advertisementRepository.save(advertisement);
    }
}
