/*package com.example.tarea_clase4_20224926.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jugador")
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "edad", length = 45)
    private String edad;

    @Column(name = "posicion", length = 45)
    private String posicion;

    @Column(name = "club", length = 45)
    private String club;



    @ManyToOne
    @JoinColumn(name = "sn_idSeleccion")
    private Seleccion seleccion;

}
*/

package com.example.tarea_clase4_20224926.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @Column(name = "department_id", nullable = false)
    private Integer id;

    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;

    // Relación ManyToOne con Employees: el manager del departamento
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees manager;

    // Relación ManyToOne con Locations: ubicación del departamento
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location;

    // Opcional: si luego quieres acceder a los empleados de este departamento
    /*
    @OneToMany(mappedBy = "department")
    private List<Employees> employees;
    */
}
