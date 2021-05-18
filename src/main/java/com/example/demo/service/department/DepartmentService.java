package com.example.demo.service.department;

import com.example.demo.model.Department;
import com.example.demo.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public List<Department> findALl() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void remove(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public List<Department> findByName(String name) {
        return null;
    }
}
