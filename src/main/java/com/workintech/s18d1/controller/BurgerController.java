package com.workintech.s18d1.controller;

import com.workintech.s18d1.dao.BurgerDao;
import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/burger")
public class BurgerController {

    BurgerDao burgerDaoImpl;

    @Autowired
    BurgerController(BurgerDao burgerDaoImpl){
        this.burgerDaoImpl=burgerDaoImpl;
    }
    @GetMapping
    List<Burger> get(){
        return burgerDaoImpl.findAll();
    }

    @GetMapping("/{id}")
    Burger getById(@PathVariable long id){
        return burgerDaoImpl.findById(id);
    }

    @PostMapping
    Burger save(@RequestBody Burger burger){
        return burgerDaoImpl.save(burger);
    }

    @PutMapping
    Burger update(@RequestBody Burger burger){
        return burgerDaoImpl.update(burger);
    }

    @DeleteMapping("/{id}")
    Burger delete(@PathVariable long id){
        return burgerDaoImpl.remove(id);
    }

    @GetMapping("/price/{price}")
    List<Burger> findByPrice(@PathVariable Integer price){
        return burgerDaoImpl.findByPrice(price);
    }

    @GetMapping("/breadType/{breadType}")
    public List<Burger> getByBreadType(@PathVariable BreadType breadType) {
        return burgerDaoImpl.findByBreadType(breadType);
    }

    @GetMapping("/content/{content}")
    public List<Burger> findByContent(@PathVariable String content){
        return burgerDaoImpl.findByContent(content);
    }



}
