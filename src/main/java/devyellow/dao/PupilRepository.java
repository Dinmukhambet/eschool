package devyellow.dao;

import devyellow.entity.Pupil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by Admin on 08.03.2017.
 */
@Repository
public class PupilRepository {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

   public int savePupil(Pupil pupil) {
      return jdbcTemplate.update("INSERT INTO pupil (firstName, lastName, mark) VALUES (?,?,?)",pupil.getFirstName(),pupil.getLastName(),pupil.getMark());

   }




   public int deletePupilById(Integer id) {
       return jdbcTemplate.update("DELETE FROM pupil where id=?",id);

   }
  //  @ModelAttribute("pupils")
    public List<Pupil> allPupils() {
        List<Pupil> pupils=jdbcTemplate.query("select * from pupil",new PupilRowMapper());
        return pupils;
    }
}
