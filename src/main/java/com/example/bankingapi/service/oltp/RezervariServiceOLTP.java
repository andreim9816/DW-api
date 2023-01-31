package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.Rezervare;
import com.example.bankingapi.dto.oltp.RezervareDtoOLTP;
import com.example.bankingapi.repository.oltp.RezervareRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RezervariServiceOLTP {

    private final RezervareRepositoryOLTP repositoryOLTP;
    private final MapperOLTP mapper;

    public Page<Rezervare> findAll(Pageable pageable) {
        return repositoryOLTP.findAll(pageable);
    }

    public Rezervare add(RezervareDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
