package com.fanch.PlaneApi.Services.Impl;

import com.fanch.PlaneApi.Repository.MotorizationRepository;
import com.fanch.PlaneApi.Repository.PlaneRepository;
import com.fanch.PlaneApi.Services.Dto.Mapper.MotorizationMapper;
import com.fanch.PlaneApi.Services.Dto.Mapper.PlaneMapper;
import com.fanch.PlaneApi.Services.Dto.Model.MotorizationDto;
import com.fanch.PlaneApi.Services.Dto.Model.PlaneDto;
import com.fanch.PlaneApi.Services.Interfaces.MotorizationService;
import com.fanch.PlaneApi.models.Faction;
import com.fanch.PlaneApi.models.Motorization;
import com.fanch.PlaneApi.models.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("MotorizationService")
public class MotorizationServiceImpl implements MotorizationService {

    @Autowired
    MotorizationRepository motorizationRepository;
    public Optional<Motorization> get(long motorizationId) {
        return motorizationRepository.findById(motorizationId);
    }

    public List<Motorization> getAll() {
        return motorizationRepository.findAll();
    }

    public Optional<Motorization> create(MotorizationDto motorizationDto) {
        return Optional.of(motorizationRepository.save(MotorizationMapper.toMotorization(motorizationDto)));
    }

    @Override
    public void delete(long motorizationId) {
        motorizationRepository.delete(get(motorizationId).get());
    }

    @Override
    public Optional<Motorization> update(long motorizationId, MotorizationDto motorizationDto) {
        Motorization motorization = get(motorizationId).get();
        delete(motorizationId);
        return create(motorizationDto);
    }

    @Override
    public Optional<Motorization> retrive(long motorizationId) {
        return motorizationRepository.findById(motorizationId);
    }
}
