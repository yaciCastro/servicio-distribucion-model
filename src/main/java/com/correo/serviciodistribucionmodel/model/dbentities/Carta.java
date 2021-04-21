package com.correo.serviciodistribucionmodel.model.dbentities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "cartas")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class Carta extends Envio{

    private boolean tipoDocumento;
}
