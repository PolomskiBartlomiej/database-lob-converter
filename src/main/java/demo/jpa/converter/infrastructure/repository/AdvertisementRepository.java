package demo.jpa.converter.infrastructure.repository;

import demo.jpa.converter.domain.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,UUID> {
}
