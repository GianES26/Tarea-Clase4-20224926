

package com.example.tarea_clase4_20224926.controller;

import com.example.tarea_clase4_20224926.entity.JobHistory;
import com.example.tarea_clase4_20224926.repository.JobHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private JobHistoryRepository jobHistoryRepository;

    // Listar historial de empleados
    @GetMapping("")
    public String listarHistorial(Model model) {
        List<JobHistory> historial = jobHistoryRepository.findAll();
        model.addAttribute("historial", historial);
        return "History/list";
    }

    // Buscar historial por nombre, apellido, puesto o departamento
    @PostMapping("/buscar")
    public String buscarHistorial(@RequestParam(name = "searchField", required = false) String searchField, Model model) {
        List<JobHistory> historialFiltrado = jobHistoryRepository.findByEmployeeFirstNameContainingOrEmployeeLastNameContainingOrJobJobTitleContainingOrDepartmentDepartmentNameContaining(
                searchField, searchField, searchField, searchField);
        model.addAttribute("historial", historialFiltrado);
        return "History/list";
    }
}
