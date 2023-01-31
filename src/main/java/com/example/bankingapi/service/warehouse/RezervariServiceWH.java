package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.RezervareWH;
import com.example.bankingapi.repository.warehouse.RezervareRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RezervariServiceWH {

    private final RezervareRepositoryWH repositoryWH;

    public Page<RezervareWH> findAll(Pageable pageable) {
        return repositoryWH.findAll(pageable);
    }
}
