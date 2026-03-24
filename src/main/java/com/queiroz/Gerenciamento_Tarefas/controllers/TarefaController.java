package com.queiroz.Gerenciamento_Tarefas.controllers;

import com.queiroz.Gerenciamento_Tarefas.models.TarefaModel;
import com.queiroz.Gerenciamento_Tarefas.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<TarefaModel>> buscar() {
        return ResponseEntity.ok().body(tarefaService.listar());
    }

    @PostMapping
    public ResponseEntity<TarefaModel> criar(@RequestBody TarefaModel tarefa) {
        return ResponseEntity.status(201).body(tarefaService.criar(tarefa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<TarefaModel>> buscar(@PathVariable Long id) {
        Optional<TarefaModel> tarefa = tarefaService.buscar(id);

        if (tarefa == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(tarefa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TarefaModel> deletar(@PathVariable Long id) {
        tarefaService.deletar(id);

        return ResponseEntity.noContent().build();
    }
}
