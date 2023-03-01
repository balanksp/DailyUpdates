package com.ZAGA.JPAdemo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.ZAGA.JPAdemo.Model.User;

public interface UserDao extends CrudRepository <User,Integer> {

}
    
