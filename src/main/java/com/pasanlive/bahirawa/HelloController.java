package com.pasanlive.bahirawa;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloController {
    Logger logger = Logger.getLogger(HelloController.class);
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model, HttpServletRequest request) {
        logger.info(request.getRemoteAddr());

        logger.info(request.getHeaderNames());
        logger.info(request.getHeader("User-Agent"));
        model.addAttribute("message", "Welcome to bahirawa");
		return "hello";
	}
}