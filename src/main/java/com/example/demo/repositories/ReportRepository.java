package com.example.demo.repositories;

import com.example.demo.models.Report;
import org.springframework.data.repository.CrudRepository;

public interface ReportRepository extends CrudRepository<Report, Long> {
}
