package com.fanch.PlaneApi.Services.Impl;

import com.fanch.PlaneApi.Repository.FactionRepository;
import com.fanch.PlaneApi.Services.Dto.Mapper.FactionMapper;
import com.fanch.PlaneApi.Services.Dto.Model.FactionDto;
import com.fanch.PlaneApi.Services.Interfaces.FactionService;
import com.fanch.PlaneApi.models.Faction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("FactionService")
public class FactionServiceImpl implements FactionService {
    @Autowired
    FactionRepository factionRepository;
    public Optional<Faction> get(long factionId) {
        return factionRepository.findById(factionId);
    }

    public List<Faction> getAll() {
        return factionRepository.findAll();
    }

    public Optional<Faction> create(FactionDto factionDto) {
        return Optional.of(factionRepository.save(FactionMapper.toFaction(factionDto)));
    }

    @Override
    public void delete(long factionId) {
        factionRepository.delete(get(factionId).get());
    }

    @Override
    public Optional<Faction> update(long factionId, FactionDto factionDto) {
        Faction faction = get(factionId).get();
        delete(factionId);
        return create(factionDto);
    }

    @Override
    public Optional<Faction> retrive(long factionId) {
        return factionRepository.findById(factionId);
    }

}
