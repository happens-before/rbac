package com.xupt.edu.rbac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//专门用于显示页面的控制器
@Controller
@RequestMapping("")
public class PageController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}

	// @RequiresPermissions("deleteOrder")
	@RequestMapping("addStudio")
	public String addStudio() {
		return "addStudio";
	}

	// @RequiresRoles("productManager")
	@RequestMapping("deleteStudio")
	public String deleteStudio() {
		return "deleteStudio";
	}

	@RequestMapping("listStudio")
	public String listStudio() {
		return "listStudio";
	}

	@RequestMapping("updateStudio")
	public String updateStudio() {
		return "updateStudio";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping("unauthorized")
	public String noPerms() {
		return "unauthorized";
	}

	// @RequiresPermissions("deleteOrder")
	@RequestMapping("addPlay")
	public String addPlay() {
		return "addPlay";
	}

	// @RequiresRoles("productManager")
	@RequestMapping("deletePlay")
	public String deletePlay() {
		return "deletePlay";
	}

	@RequestMapping("listPlay")
	public String listPlay() {
		return "listPlay";
	}

	@RequestMapping("updatePlay")
	public String updatePlay() {
		return "updatePlay";
	}



	@RequestMapping("deleteSchedule")
	public String deleteSchedule() {
		return "deleteSchedule";
	}


	@RequestMapping("addSchedule")
	public String addSchedule() {
		return "addSchedule";
	}

	@RequestMapping("listSchedule")
	public String listSchedule() {
		return "listSchedule";
	}

	@RequestMapping("updateSchedule")
	public String updateSchedule() {
		return "updateSchedule";
	}


	@RequestMapping("deleteTicket")
	public String deleteTicket() {
		return "deleteTicket";
	}

	@RequestMapping("addTicket")
	public String addTicket() {
		return "addTicket";
	}

	@RequestMapping("updateTicket")
	public String updateTicket() {
		return "updateTicket";
	}

	@RequestMapping("listTicket")
	public String listTicket() {
		return "listTicket";
	}



	@RequestMapping("sumSaleRecord")
	public String sumSaleRecord() {
		return "sumSaleRecord";
	}

	@RequestMapping("listSaleRecord")
	public String listSaleRecord() {
		return "listSaleRecord";
	}

	@RequestMapping("addSaleItem")
	public String addSaleItem() {
		return "addSaleItem";
	}

	@RequestMapping("listSaleItem")
	public String listSaleItem() {
		return "listSaleItem";
	}



}
