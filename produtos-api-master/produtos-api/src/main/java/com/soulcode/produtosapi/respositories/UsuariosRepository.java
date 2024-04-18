package com.soulcode.produtosapi.respositories;

import com.soulcode.produtosapi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {


}
