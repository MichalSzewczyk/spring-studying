package template;

import impl.dao.CarDAO;
import dto.CarDTO;
import mappers.CarMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 *
 */
@SuppressWarnings("all")
public class CarJDBCTemplate implements CarDAO {
    private DataSource ds;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.ds = ds;
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public void create(Integer id, String model, Integer price) {
        String SQL = "INSERT INTO cars (id, model, price) VALUE (?, ?, ?)";
        jdbcTemplate.update(SQL, id, model, price);
    }

    @Override
    public CarDTO getCar(Integer id) {
        String SQL = "SELECT * FROM cars WHERE id=?";
        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new CarMapper());
    }

    @Override
    public List<CarDTO> listCars() {
        String SQL = "SELECT * FROM cars";
        return jdbcTemplate.query(SQL,
                new CarMapper());
    }

    @Override
    public void delete(Integer id) {
        String SQL = "DELETE FROM cars WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    @Override
    public void update(Integer id, String model) {
        String SQL = "UPDATE cars SET model = ? WHERE id = ?";
        jdbcTemplate.update(SQL, model, id);
    }
}
