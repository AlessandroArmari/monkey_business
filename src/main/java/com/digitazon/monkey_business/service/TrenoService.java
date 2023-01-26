package com.digitazon.monkey_business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.monkey_business.model.Treno;
import com.digitazon.monkey_business.repository.TrenoRepository;

@Service
public class TrenoService {
    @Autowired
    TrenoRepository trenoRepository;

    public Treno saveTreno(Treno treno) {
        return trenoRepository.save(treno);

    }

    public List<Treno> findAllTreni() {
        return trenoRepository.findAll();
    }

    public Treno findById(Long id) {

        Optional<Treno> trenoOptional = trenoRepository.findById(id);

        if (trenoOptional.isPresent())
            return trenoOptional.get();

        else
            return null;
    }

}