package devyellow.dao;

import devyellow.entity.Pupil;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Admin on 09.03.2017.
 */
public class PupilRowMapper implements RowMapper<Pupil> {

    @Override
    public Pupil mapRow(ResultSet resultSet, int i) throws SQLException {
        Pupil pupil = new Pupil();
        pupil.setId(resultSet.getInt(1));
        pupil.setFirstName(resultSet.getString(2));
        pupil.setLastName(resultSet.getString(3));
        pupil.setMark(resultSet.getInt(4));
        return pupil;

    }
}
