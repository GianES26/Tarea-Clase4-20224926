package com.example.tarea_clase4_20224926.controller;

import com.example.tarea_clase4_20224926.dto.EmpleadosSalarioMayorDto;
import com.example.tarea_clase4_20224926.dto.MayorTresEmpleadosDto;
import com.example.tarea_clase4_20224926.dto.GerenteConExperienciaDto;
import com.example.tarea_clase4_20224926.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping("/search/reporte")
    public String mostrarReporte(Model model) {
        List<EmpleadosSalarioMayorDto> empleadosSalario = employeesRepository.obtenerHistorialDeEmpleadosConSalarioMayorA15000();
        List<MayorTresEmpleadosDto> departamentosPorPaisYCiudad = employeesRepository.obtenerDepartamentosConMasDeTresEmpleados();
        List<GerenteConExperienciaDto> gerentesConExperiencia = employeesRepository.obtenerGerentesConMasDeCincoAniosExperiencia();

        model.addAttribute("empleadosSalario", empleadosSalario);
        model.addAttribute("departamentosPorPaisYCiudad", departamentosPorPaisYCiudad);
        model.addAttribute("gerentesConExperiencia", gerentesConExperiencia);

        return "Search/reporte";
    }
}
