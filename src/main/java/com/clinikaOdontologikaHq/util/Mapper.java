package com.clinikaOdontologikaHq.util;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class Mapper {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
