/* package com.example.tarea_clase4_20224926.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jugador")
public class Locations {

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
@Table(name = "locations")
public class Locations {

    @Id
    @Column(name = "location_id", nullable = false)
    private Integer id;

    @Column(name = "street_address", length = 40)
    private String streetAddress;

    @Column(name = "postal_code", length = 12)
    private String postalCode;

    @Column(name = "city", nullable = false, length = 30)
    private String city;

    @Column(name = "state_province", length = 25)
    private String stateProvince;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries country;

    // Si más adelante deseas ver todos los departamentos en esta ubicación:
    /*
    @OneToMany(mappedBy = "location")
    private List<Departments> departments;
    */
}

