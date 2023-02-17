package de.hhn.rz.db;

import de.hhn.rz.db.entities.AuditLogEntry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditLogRepository extends PagingAndSortingRepository<AuditLogEntry, Long> {

}
