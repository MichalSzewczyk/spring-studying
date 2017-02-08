package mappers;

import dto.CarDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 *
 */
public class CarMapper implements RowMapper<CarDTO> {
    @Override
    public CarDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(resultSet.getInt("id"));
        carDTO.setModel(resultSet.getString("components.model"));
        carDTO.setPrice(resultSet.getInt("price"));
        return carDTO;
    }
}
