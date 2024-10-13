package com.cibertec.honsan_store.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_User")
@Data
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_User")
    private Integer idUser;

    @Column(name = "nombres", length = 200, nullable = false)
    private String nombres;

    @Column(name = "apellidos", length = 200, nullable = false)
    private String apellidos;

    @Column(name = "correo", length = 200, nullable = false)
    private String correo;

    @Column(name = "contrasenia", length = 200, nullable = false)
    private String autorLibro;

    @Column(name = "dni", length = 10, nullable = false)
    private String dni;


}
