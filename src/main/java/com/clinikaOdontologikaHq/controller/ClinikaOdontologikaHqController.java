package com.clinikaOdontologikaHq.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class ClinikaOdontologikaHqController {

    /*@GetMapping("/")
    public String saludo(){
        return "Bienvenido, estás conectado a Clinik";

    }*/


  /* @GetMapping("/inicio")
    public String paginaInicio(Model model) {
        model.addAttribute("nombre", "diez");
        return "index";
    }*/

    /*@RequestMapping("/")
    public ModelAndView paginaInicio() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }*/
    /*@RequestMapping("/index.html")
    public ModelAndView paginaIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }*/

    /*@RequestMapping("/odontologos.html")
    public ModelAndView paginaOdontologos() {
        ModelAndView modelAndView1 = new ModelAndView();
        modelAndView1.setViewName("odontologos");
        return modelAndView1;
    }

    @RequestMapping("/registro_odontologo.html")
    public ModelAndView paginaRegistroOdontologos() {
        ModelAndView modelAndView2 = new ModelAndView();
        modelAndView2.setViewName("registro_odontologo");
        return modelAndView2;
    }*/
}
