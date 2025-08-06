package com.incident.Incident_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incident.Incident_management.entity.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> {
}
