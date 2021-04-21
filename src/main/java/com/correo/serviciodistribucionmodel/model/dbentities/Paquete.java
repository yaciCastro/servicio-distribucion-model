package com.correo.serviciodistribucionmodel.model.dbentities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "paquetes")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class Paquete extends Envio{

    private Double pesoEnGramos;
    private Double anchoEnCentimentros;
    private Double altoEnCentimetros;

}
