package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.TimpWH;
import com.example.bankingapi.repository.warehouse.TimpRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimpServiceWH {

    private final TimpRepositoryWH repositoryWH;

    public Page<TimpWH> findAll(Pageable pageable) {
        return repositoryWH.findAll(pageable);
    }


}
