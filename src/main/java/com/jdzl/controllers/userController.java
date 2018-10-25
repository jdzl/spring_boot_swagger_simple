package com.jdzl.controllers;

import com.jdzl.models.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@Api(value = "users", description = "Users API")
public class testController {



	@RequestMapping(value="/users/{id}/products",method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(
			value = "Get  accountNumber info",
			response = Product.class,
			notes = "returns the information of an account number")
	@ApiResponses({
			@ApiResponse(code = 200, message = "returns the information of an account number"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	public Product check(@PathVariable String id)
	{
		return new Product(UUID.randomUUID() , id,"8733400912","12/05/2018",8600000);

	}

@RequestMapping(value = "",method = RequestMethod.GET)
	public String index() {
		return "API usuarios :: working from Spring Boot!";
	}





}
