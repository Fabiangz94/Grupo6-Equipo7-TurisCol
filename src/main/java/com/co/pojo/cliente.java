
package com.co.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class cliente implements Serializable {
    
    @Id
    private Integer idcliente;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String correo;
    private String password;
    
}
