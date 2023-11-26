package mvc_project.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.tags.Param;

import mvc_project.dao.UserCrud;
import mvc_project.dto.User;

@Controller
public class UserController {

	@Autowired
	UserCrud ucd;

	@RequestMapping("/register")
	public ModelAndView signup() {

		ModelAndView view = new ModelAndView("Register.jsp");

		view.addObject("user", new User());

		return view;

	}

	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute User user) {

		ModelAndView view = new ModelAndView();

		try {
			User dbuser = ucd.Insert(user);
			view.addObject("user", dbuser);
			view.setViewName("Login.jsp");
		} catch (Exception e) {
			view.addObject("user", new User());
			view.setViewName("Register.jsp");

		}
		return view;

	}

	@RequestMapping("/signin")
	public ModelAndView SignIn() {
		ModelAndView view = new ModelAndView("Login.jsp");
		return view.addObject("user", new User());

	}

	@RequestMapping("/login")
	public ModelAndView Login(@ModelAttribute User user) {

		ModelAndView view = new ModelAndView();

		try {
			User dbuser = ucd.Login(user.getEmail());

			if (dbuser.getPwd().equals(user.getPwd())) {
				List<User> list = ucd.fetchAll();
				view.addObject("li", list);
				view.setViewName("view.jsp");
			} else {
				view.addObject("user", new User());
				view.setViewName("Login.jsp");
			}
		} catch (Exception e) {
			view.addObject("user", new User());
			view.setViewName("Login.jsp");
		}
		return view;

	}
	
	
	
	@RequestMapping("/update")
public ModelAndView Edit(@ModelAttribute User user) {
		ModelAndView view =new ModelAndView();
		//System.out.println("user id:"+user.getId());
		User dbuser = ucd.fetchById(user.getId());
		view.addObject("user", dbuser);
		view.setViewName("Edit.jsp");
		return view;
	
}
@RequestMapping("/edit")
	public ModelAndView Upadte(@RequestParam User user) {
	
		ModelAndView view=new ModelAndView();
		ucd.Update(user);
		List<User> list = ucd.fetchAll();
		view.addObject("li", list);
		view.setViewName("view.jsp");
		
		
		return view;
		
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView view =new ModelAndView();
		
		User dbuser = ucd.Delete(id);
		List<User> list = ucd.fetchAll();
		view.addObject("li", list);
		view.setViewName("view.jsp");
		
		return view;
	
}
	
	
	
	
}
