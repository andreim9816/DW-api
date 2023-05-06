package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.Rezervare;
import com.example.bankingapi.dto.oltp.RezervareDtoOLTP;
import com.example.bankingapi.repository.lowcost.RezervareRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RezervariServiceLow {

    private final RezervareRepositoryLow repositoryOLTP;
    private final MapperOLTP mapper;

    public Page<Rezervare> findAll(Pageable pageable) {
        return repositoryOLTP.findAll(pageable);
    }

    public Rezervare add(RezervareDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
