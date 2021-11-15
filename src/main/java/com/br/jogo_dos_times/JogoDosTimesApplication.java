package com.br.jogo_dos_times;

import javax.swing.JPanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.br.jogo_dos_times.controller.TimeController;


@SpringBootApplication
@ComponentScan({ "com.br.jogo_dos_times.model.Time" })
public class JogoDosTimesApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(JogoDosTimesApplication.class, args);
		System.setProperty("java.awt.headless", "false"); 
		JPanel cdframe = new JPanel();
		TimeController controller = new TimeController() ;
        
		controller.showConfirmDialog(cdframe, null, controller, 0 );      
    }
}
