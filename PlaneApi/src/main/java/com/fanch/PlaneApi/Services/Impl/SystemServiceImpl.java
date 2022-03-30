package com.fanch.PlaneApi.Services.Impl;

import com.fanch.PlaneApi.Repository.SystemRepository;
import com.fanch.PlaneApi.Services.Dto.Mapper.SystemMapper;
import com.fanch.PlaneApi.Services.Dto.Model.SystemDto;
import com.fanch.PlaneApi.Services.Interfaces.SystemService;
import com.fanch.PlaneApi.models.Plane;
import com.fanch.PlaneApi.models.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SystemService")
public class SystemServiceImpl implements SystemService {
    @Autowired
    SystemRepository systemRepository;
    public Optional<System> get(long systemId) {
        return systemRepository.findById(systemId);
    }

    public List<System> getAll() {
        return systemRepository.findAll();
    }

    public Optional<System> create(SystemDto systemDto) {
        return Optional.of(systemRepository.save(SystemMapper.toSystem(systemDto)));
    }

    @Override
    public void delete(long systemId) {
        systemRepository.delete(get(systemId).get());
    }

    @Override
    public Optional<System> update(long systemId, SystemDto systemDto) {
        delete(systemId);
        return create(systemDto);
    }

    @Override
    public Optional<System> retrive(long systemId) {
        return systemRepository.findById(systemId);
    }

}
