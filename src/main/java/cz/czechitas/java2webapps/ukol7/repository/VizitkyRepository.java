package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Vizitka;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pro přístup k databázové tabulce {@code osoba}.
 */
@Repository
public interface VizitkyRepository extends CrudRepository<Vizitka, Integer> {
}