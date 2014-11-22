package com.usc.hanafuda.entities;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.usc.hanafuda.handlers.MyAssetHandler;

public class CardButton extends JButton{
	private int x =40;
	public CardButton(ImageIcon cardIconArray){
		this.setIcon(cardIconArray);
		
	}

	public int getNewX() {
		return x;
	}

	
	public void moveUpDown(){
		if(x == 20) { 
			x = 40; 
		}
		else if(x == 40) {
			x = 20; 
		}		
	}

	public void setCard(Card card){
		ImageIcon icon = MyAssetHandler.getIcon(card.getId());
		this.setIcon(icon);
		
		
	}

	
}
