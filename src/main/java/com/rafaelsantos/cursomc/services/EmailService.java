package com.rafaelsantos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rafaelsantos.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}


