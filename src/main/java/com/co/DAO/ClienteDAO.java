
package com.co.DAO;

import com.co.pojo.cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDAO extends CrudRepository<cliente,Integer> {
    
}
