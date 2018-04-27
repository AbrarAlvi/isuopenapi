package com.postnord.isuopenapi.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;

@Controller
@Api(value="Get All Routes")
public class Routes {
	
	@RequestMapping(value = "/getroutes", method = RequestMethod.GET)
	public String getRoutes(ModelMap model) {

		model.addAttribute("message", "Message Testing");
		return "routes";

	}

}
