package com.ruisudev.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruisudev.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
