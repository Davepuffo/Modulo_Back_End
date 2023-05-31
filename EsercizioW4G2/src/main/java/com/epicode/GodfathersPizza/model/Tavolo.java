package com.epicode.GodfathersPizza.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Tavolo {

		private int numeroTavolo;
		private int numeroCoperti;
		private boolean occupato ;
		
		public Tavolo(int numeroTavolo, int numeroCoperti) {
			super();
			this.numeroTavolo = numeroTavolo;
			this.numeroCoperti = numeroCoperti;
			this.occupato = false;
		}
		
		
		
}
