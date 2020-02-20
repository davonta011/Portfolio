package com.portfolio.PortfolioUsersMS.Controller;

import com.portfolio.PortfolioUsersMS.Model.CreateUserRequestModel;
import com.portfolio.PortfolioUsersMS.Service.UsersService;
import com.portfolio.PortfolioUsersMS.Shared.UserDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/status/check")
    public String status(){
        return "Working...";
    }

    @PostMapping()
    public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(userDetails, UserDto.class);
        usersService.createUser(userDto);
        return "user is created...";
    }
}
