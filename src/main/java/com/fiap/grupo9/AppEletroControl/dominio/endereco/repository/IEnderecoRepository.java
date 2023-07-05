package com.fiap.grupo9.AppEletroControl.dominio.endereco.repository;

import com.fiap.grupo9.AppEletroControl.dominio.endereco.entitie.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco,UUID> {
}
