package demo.jpa.converter.app.dto;

import demo.jpa.converter.domain.model.Advertisement;

import java.net.MalformedURLException;

public interface AdvertisementConverter {

    Advertisement toEntity(AdvertisementDto dto) throws MalformedURLException;
}
