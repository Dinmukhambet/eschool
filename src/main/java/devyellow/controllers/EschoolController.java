package devyellow.controllers;

import devyellow.dao.PupilRepository;
import devyellow.entity.Pupil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Admin on 07.03.2017.
 */
@Controller
public class EschoolController {
        @Autowired
        PupilRepository pupilRepository;
    @RequestMapping(value = "/")
    public String indexpage(ModelMap modelMap){
        modelMap.addAttribute("pupils", pupilRepository.allPupils());
        return "index";
    }

    @RequestMapping(value = "/newpupil", method = RequestMethod.GET)
    public String pupilPage(final Pupil pupil){
        return "addpage";
    }

    @RequestMapping(value = "/addpupil",method = RequestMethod.POST)
    public String newPupil(Pupil pupil){
        pupilRepository.savePupil(pupil);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        pupilRepository.deletePupilById(id);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "loginpage";
    }
}
