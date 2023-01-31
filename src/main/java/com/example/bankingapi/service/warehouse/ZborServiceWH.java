package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.ZborWH;
import com.example.bankingapi.repository.warehouse.ZborRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZborServiceWH {

    private final ZborRepositoryWH repositoryWH;

    public Page<ZborWH> findAll(Pageable pageable) {
        return repositoryWH.findAll(pageable);
    }

}
