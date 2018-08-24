package demo.jpa.converter.infrastructure.converter;

import com.google.gson.Gson;
import demo.jpa.converter.domain.model.HtmlAdvertisement;

import javax.persistence.AttributeConverter;

public class HtmlAdvertisementConverter implements AttributeConverter<HtmlAdvertisement,String> {

    private static final Gson GSON = new Gson();

    @Override
    public String convertToDatabaseColumn(HtmlAdvertisement attribute) {
        return GSON.toJson(attribute);
    }

    @Override
    public HtmlAdvertisement convertToEntityAttribute(String dbData) {
        return GSON.fromJson(dbData,HtmlAdvertisement.class);
    }
}
