package com.gfi.PruebaNumero27.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;


import com.gfi.PruebaNumero27.dto.PruebaNumero27Dto;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/undefined")
@Api(value="undefined", description="undefined repository")
public class PruebaNumero27Controller {


	@ApiOperation(value = "get undefined")
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public PruebaNumero27Dto getExample(@PathVariable("id") String id) {
	//TODO: PENDIENTE IMPLEMENTACION DESARROLLO		
		log.debug("ejemplo log con slf4j");

		PruebaNumero27Dto dtoExample = new PruebaNumero27Dto();
		return dtoExample;
	}

}
