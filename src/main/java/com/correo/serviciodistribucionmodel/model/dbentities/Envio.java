package com.correo.serviciodistribucionmodel.model.dbentities;

import com.correo.serviciodistribucionmodel.model.utils.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class Envio extends BaseEntity {

    private Long remitenteUsuarioId;
    private Long destinatarioUsuarioId;

    @Column(unique = true)
    private Long numeroDeSeguimiento;

}
