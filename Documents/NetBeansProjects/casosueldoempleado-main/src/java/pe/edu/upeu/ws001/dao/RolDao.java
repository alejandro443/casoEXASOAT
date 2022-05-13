package pe.edu.upeu.ws001.dao;
import java.util.List;
import pe.edu.upeu.ws001.model.Rol;

/**
 *
 * @author J05K4
 */
public interface RolDao {

    int create(Rol rol);

    int update(Rol rol);

    int delete(int rol);

    Rol read(int id);

    List<Rol> readAll();
}