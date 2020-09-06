package ru.cbr.printmanager.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cbr.printmanager.model.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {
}
