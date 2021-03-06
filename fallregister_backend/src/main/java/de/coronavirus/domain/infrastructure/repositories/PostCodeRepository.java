package de.coronavirus.domain.infrastructure.repositories;

import de.coronavirus.application.dtos.service.PostCodeDto;
import de.coronavirus.domain.model.City;
import de.coronavirus.domain.model.PostCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostCodeRepository extends JpaRepository<PostCode, Long> {

    Optional<PostCode> findByCityAndCode(City city, long code);

    List<PostCodeDto> findAllDtoBy();

    Optional<PostCodeDto> findDtoByCode(Long code);

    List<PostCodeDto> findTop10ByCodeStartsWith(String partial);
}
