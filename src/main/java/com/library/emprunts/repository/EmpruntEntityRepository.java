package com.library.emprunts.repository;

import com.library.emprunts.data.EmpruntEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "emprunts")
public interface EmpruntEntityRepository extends PagingAndSortingRepository<EmpruntEntity, Long> {
    Page<EmpruntEntity> findByExemplaireBarcode(String exemplaireBarcode, Pageable paging);
}
