package com.incident.Incident_management.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incident.Incident_management.entity.Incident;
import com.incident.Incident_management.service.IncidentService;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    private final IncidentService service;

    public IncidentController(IncidentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Incident> getAll() {
        return service.getAllIncidents();
    }

    @PostMapping
    public Incident create(@RequestBody Incident incident) {
        return service.createIncident(incident);
    }
}
