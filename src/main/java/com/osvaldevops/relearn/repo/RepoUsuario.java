package com.osvaldevops.relearn.repo;

import com.osvaldevops.relearn.model.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepoUsuario extends PagingAndSortingRepository<Usuario, Integer> {
    Usuario findByUsername(String username);
    Usuario findById(int id);
}
