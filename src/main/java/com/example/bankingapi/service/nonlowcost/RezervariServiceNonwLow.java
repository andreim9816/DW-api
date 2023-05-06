package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.Rezervare;
import com.example.bankingapi.repository.nonlowcost.RezervareRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RezervariServiceNonwLow {

    private final RezervareRepositoryNonLow repositoryWH;

    public Page<Rezervare> findAll(Pageable pageable) {
        return repositoryWH.findAll(pageable);
    }
}
