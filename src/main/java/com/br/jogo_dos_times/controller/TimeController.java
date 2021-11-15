package com.br.jogo_dos_times.controller;

import java.awt.Image;
import java.util.List;
import java.util.StringJoiner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.jogo_dos_times.model.Time;
import com.br.jogo_dos_times.service.TimeService;

@RestController
@RequestMapping("/times")
public class TimeController  {

	@Autowired
	private TimeService timeService = new TimeService();
	private  Time time = new Time();	 	

	int pergunta;
	String entrada;
	String resultado;
    String[] options = {"Sim", "Não"};
    StringJoiner joiner = new StringJoiner(" ");
    Image newImage;
    ImageIcon icon;
    Image newimg;
    
	@GetMapping
	public void showConfirmDialog(JPanel cdframe, String message, Object object, int plainMessage) { 
	    ImageIcon icon = new 
	            ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/bola.png");
	    newImage = icon.getImage();
	    newimg = newImage.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); 
	    icon = new ImageIcon(newimg);
		
		 pergunta =  javax.swing.JOptionPane.showConfirmDialog( cdframe, "Pense em um time ", null, JOptionPane.PLAIN_MESSAGE);
		 pergunta = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é rubro negro?",
	                "Jogo dos times", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
	        
        if (pergunta == JOptionPane.YES_OPTION) {
        	 int pergunta2 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é Carioca?",
                    "Jogo dos times", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        	 joiner.add("O time é rubro negro.");
        	 time.setCaracteristicas(joiner.toString());
        	if(pergunta2 == JOptionPane.YES_OPTION) {
        		int pergunta3 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é o Flamengo?",
                        "Jogo dos times", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        	 joiner.add("O time é carioca.");
           	 time.setCaracteristicas(joiner.toString());
        		if(pergunta3 == JOptionPane.YES_OPTION) {
        			icon = new 
        	                ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/flamengo.png");
        	        Image imageFlamengo = icon.getImage();
        	        newImage = imageFlamengo.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); 
        	        icon = new ImageIcon(newImage);
        	        javax.swing.JOptionPane.showConfirmDialog( cdframe, "Acertei!!!!","Jogo dos times",
        	        		JOptionPane.PLAIN_MESSAGE, pergunta3, icon);
        	        time.setNome("Flamengo");
        		}else {
        			 entrada=  javax.swing.JOptionPane.showInputDialog("Qual time voce pensou ?");
        			 time.setNome(entrada);
					 resultado =javax.swing.JOptionPane.showInputDialog(cdframe,entrada+
							 " é ________ mas o Flamengo não é  ",null);
					 joiner.add(resultado);
		        	 time.setCaracteristicas(joiner.toString());
        		}
        	}else{
        		int pergunta9 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é o Sport?",
                        "Jogo dos times", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        		if(pergunta9 == JOptionPane.YES_OPTION) {
        			icon= new 
        	                ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/sport.png");
        	        Image imageSport = icon.getImage();
        	        newImage= imageSport.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); 
        	        icon = new ImageIcon(newImage);
        	        javax.swing.JOptionPane.showConfirmDialog( cdframe, "Acertei!!!!","Jogo dos times",
        	        		JOptionPane.PLAIN_MESSAGE, pergunta9, icon);
        	        time.setNome("Sport");
        		}else {
        			 entrada=  javax.swing.JOptionPane.showInputDialog("Qual time voce pensou ?");
					 
					 resultado =javax.swing.JOptionPane.showInputDialog(cdframe,entrada+
							 " é ________ mas o Sport não é  ",null);
					 time.setNome(entrada);
					 joiner.add(resultado);
		        	 time.setCaracteristicas(joiner.toString());
        		}
        	}
        } else {
        	int pergunta4 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é alviverde?",
                    "Jogo dos times", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
			if(pergunta4 == JOptionPane.YES_OPTION) {
				int pergunta5 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é paulista?",
                        "Jogo dos times", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
				joiner.add("O time é alviverde.");
        		time.setCaracteristicas(joiner.toString());
				if(pergunta5 == JOptionPane.YES_OPTION) {
					int pergunta6 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é o Palmeiras?",
                            "Jogo dos times", JOptionPane.YES_NO_OPTION, 
                            JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					joiner.add("O time é paulista.");
	        		time.setCaracteristicas(joiner.toString());
					if(pergunta6 == 0) {
						icon = new 
	        	                ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/palmeiras.png");
	        	        Image imagePalmeiras = icon.getImage();
	        	        newImage = imagePalmeiras.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); 
	        	        icon = new ImageIcon(newImage);
	        	        javax.swing.JOptionPane.showConfirmDialog( cdframe, "Acertei!!!!","Jogo dos times",
	        	        		JOptionPane.PLAIN_MESSAGE, pergunta4, icon);
	        	        time.setNome("Palmeiras");
					}else {
	                     entrada=  javax.swing.JOptionPane.showInputDialog("Qual time voce pensou ?");
						 resultado =javax.swing.JOptionPane.showInputDialog(cdframe,entrada+
								 " é ________ mas o Palmeiras não é  ",null);
						 time.setNome(entrada);
						 joiner.add(resultado);
			        	 time.setCaracteristicas(joiner.toString());
					}
				}else {
					int pergunta10 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é o Goias?",
                            "Jogo dos times", JOptionPane.YES_NO_OPTION, 
                            JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					if(pergunta10 == JOptionPane.YES_OPTION) {
						icon = new 
	        	                ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/goias.png");
	        	        Image imageGoias = icon.getImage();
	        	        newImage = imageGoias.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); 
	        	        icon = new ImageIcon(newImage);
	        	        javax.swing.JOptionPane.showConfirmDialog( cdframe, "Acertei!!!!","Jogo dos times",
	        	        		JOptionPane.PLAIN_MESSAGE, pergunta4, icon);
	        	        time.setNome("Goias");
					}else {
						 entrada=  javax.swing.JOptionPane.showInputDialog("Qual time voce pensou ?");
						 
						 resultado =javax.swing.JOptionPane.showInputDialog(cdframe,entrada+
								 " é ________ mas o Goiás não é  ",null);
						 time.setNome("entrada");
						 joiner.add("resultado");
			        		time.setCaracteristicas(joiner.toString());
					}
				}
			}else {
				int pergunta7 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é Gaucho?",
	                    "Jogo dos times", JOptionPane.YES_NO_OPTION, 
	                    JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
				if(pergunta7 == JOptionPane.YES_OPTION) {
					int pergunta8 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é o Inter?",
		                    "Jogo dos times", JOptionPane.YES_NO_OPTION, 
		                    JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					joiner.add("O time é gaucho.");
	        		time.setCaracteristicas(joiner.toString());
					if(pergunta8 == JOptionPane.YES_OPTION) {
						icon = new 
	        	                ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/inter.png");
	        	        Image imageInter = icon.getImage();
	        	        newImage = imageInter.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); 
	        	        icon = new ImageIcon(newImage);
	        	        javax.swing.JOptionPane.showConfirmDialog( cdframe, "Acertei!!!!","Jogo dos times",
	        	        		JOptionPane.PLAIN_MESSAGE, pergunta4, icon);
	        	        time.setNome("Inter");
					}else{
						 entrada=  javax.swing.JOptionPane.showInputDialog("Qual time voce pensou ?");
						 
						 resultado =javax.swing.JOptionPane.showInputDialog(cdframe,entrada+
								 " é ________ mas o Inter não é  ",null);
						 time.setNome(entrada);
						 joiner.add(resultado);
			        	 time.setCaracteristicas(joiner.toString());
					}
				}else {
					int pergunta11 = javax.swing.JOptionPane.showOptionDialog(cdframe, "O time que você pensou é o Cruzeiro?",
		                    "Jogo dos times", JOptionPane.YES_NO_OPTION, 
		                    JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					if(pergunta11 == JOptionPane.YES_OPTION) {			
						icon = new 
	        	                ImageIcon("src/main/java/com/br/jogo_dos_times/webapp/img/cruzeiro.png");
	        	        Image imageCruzeiro = icon.getImage();
	        	        newImage = imageCruzeiro.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); 
	        	        icon = new ImageIcon(newImage);
	        	        javax.swing.JOptionPane.showConfirmDialog( cdframe, "Acertei!!!!","Jogo dos times",
	        	        		JOptionPane.PLAIN_MESSAGE, pergunta4, icon);
	        	        time.setNome("Cruzeiro");
					}else {
	                     entrada=  javax.swing.JOptionPane.showInputDialog("Qual time voce pensou ?");
						 
						 resultado =javax.swing.JOptionPane.showInputDialog(cdframe,entrada+
								 " é ________ mas o Cruzeiro não é  ",null);
						 time.setNome(entrada);
						 joiner.add(resultado);
			        	 time.setCaracteristicas(joiner.toString());
					}			
				}			
			}
        }
        timeService.addTime(time);
    }
	
    @RequestMapping("/timelist.json")
    public @ResponseBody List<Time> getTimeList() {
        return timeService.getAllTimes();
    }
    
    @RequestMapping("/layout")
    public String getTimePartialPage() {
        return "times/layout";
    }
	
}
