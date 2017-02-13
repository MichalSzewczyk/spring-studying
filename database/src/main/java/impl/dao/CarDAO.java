package impl.dao;

import dto.CarDTO;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 * 
 */
public interface CarDAO {
     void setDataSource(DataSource ds);

     void create(Integer id, String model, Integer price);

     CarDTO getCar(Integer id);

     List<CarDTO> listCars();

     void delete(Integer id);

     void update(Integer id, String model);
}
