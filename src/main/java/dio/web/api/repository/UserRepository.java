package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");
        if (usuario.getPassword() == null)
            throw new CampoObrigatorioException("password");
        if (usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDADE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário ", id);
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Emannuel","Manel32"));
        usuarios.add(new Usuario("Frank", "masterpass"));
        return  usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário", id);
        return new Usuario("Frank", "masterpass");
    }
    public  Usuario findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar o usuário",username);
        return  new Usuario("Frank", "masterpass");
    }
}
