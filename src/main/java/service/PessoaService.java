package service;

import com.exemplo.model.Pessoa;
import com.exemplo.repository.PessoaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PessoaService {

    @Inject
    PessoaRepository repository;

    public List<Pessoa> listar() {
        return repository.listAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        repository.persist(pessoa);
        return pessoa;
    }

    public Pessoa buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
