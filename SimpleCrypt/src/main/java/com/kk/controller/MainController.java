package com.kk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kk.model.InputModel;
import com.kk.util.ICrypterService;

@Controller
public class MainController {

	@Autowired
	private ICrypterService serviceObj;
	
	@RequestMapping("main")
	public String MainPage() {
		
		return "main";
	}

	@RequestMapping("encrypterPage")
	public String encrypterPage(@ModelAttribute("inputModel") InputModel im) {

		return "encrypterPage";
	}

	@RequestMapping("decrypterPage")
	public String deCrypterPage(@ModelAttribute("inputModel") InputModel im) {

		return "decrypterPage";
	}

	@RequestMapping("getDecryptData")
	public String deCryptPage(@ModelAttribute("inputModel") InputModel im, Model m) {
		String resultData = serviceObj.getDecryptMessage(im.getMessage(), im.getDisplacer());
		m.addAttribute("resultData", resultData);

		return "resultPage";
	}

	@RequestMapping("getCryptData")
	public String cryptPage(@ModelAttribute("inputModel") InputModel im, Model m) {

		String resultData = serviceObj.getCryptMessage(im.getMessage(), im.getDisplacer());
		m.addAttribute("resultData", resultData);
		return "resultPage";
	}
}
