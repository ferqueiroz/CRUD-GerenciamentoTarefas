package com.queiroz.Gerenciamento_Tarefas.repositories;

import com.queiroz.Gerenciamento_Tarefas.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}
