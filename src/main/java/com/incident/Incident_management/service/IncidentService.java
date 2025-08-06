package com.incident.Incident_management.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.incident.Incident_management.entity.Incident;
import com.incident.Incident_management.repository.IncidentRepository;

@Service
public class IncidentService {

    private final IncidentRepository repository;

    public IncidentService(IncidentRepository repository) {
        this.repository = repository;
    }

    public List<Incident> getAllIncidents() {
        return repository.findAll();
    }

    public Incident createIncident(Incident incident) {
        incident.setCreatedAt(LocalDateTime.now());
        incident.setUpdatedAt(LocalDateTime.now());
        return repository.save(incident);
    }
}
