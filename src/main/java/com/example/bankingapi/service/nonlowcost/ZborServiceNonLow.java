package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.Zbor;
import com.example.bankingapi.repository.nonlowcost.ZborRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZborServiceNonLow {

    private final ZborRepositoryNonLow repositoryNonLow;

    public Page<Zbor> findAll(Pageable pageable) {
        return repositoryNonLow.findAll(pageable);
    }

}
