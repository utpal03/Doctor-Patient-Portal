package com.example.doctor_patient_portal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.doctor_patient_portal.Model.Doctor;

@Repository
public interface Doctorrepo extends JpaRepository<Doctor, Integer> {

}
