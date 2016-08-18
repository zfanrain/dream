package net.wudi.core.web.back;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {
	
	@RequestMapping({"","/","index.*"})
	public String index(Model model){
		model.addAttribute("msg", "test2");
		return "core/index";
	}
	@RequestMapping("/container")
	public String container(){
		return "container";
	}
	@RequestMapping("/api")
	public String api(){
		return "api";
	}
	@RequestMapping("/node")
	public String node(){
		return "core/node/node-list";
	}	
}
