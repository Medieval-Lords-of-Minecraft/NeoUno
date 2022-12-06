package me.neoblade298.neouno.Cards;

import org.bukkit.ChatColor;

import me.neoblade298.neouno.Objects.Game;

public class WildDrawFour implements Card{
	private Game game;
	private int number;
	private ChatColor color;
	private String display;
	private String alias;
	
	public WildDrawFour(Game game) {
		this.game = game;
		this.number = -1;
		this.color = ChatColor.WHITE;
		this.display = this.color + "+4";
		this.alias = "+4";
	}

	@Override
	public ChatColor getColor() {
		return this.color;
	}

	@Override
	public void setColor(ChatColor color) {
		this.color = color;
		this.display = this.color + "+4";
	}

	@Override
	public int getNumber() {
		return this.number;
	}

	@Override
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String getDisplay() {
		return this.display;
	}
	
	@Override
	public void setDisplay(String display) {
		this.display = display;
	}

	@Override
	public void onPlay() {
		game.requiredAction = "PICK_COLOR";
		game.drawNum += 4;
		number = game.topCard.getNumber();
	}

	@Override
	public void onDraw(boolean normalDraw) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getAlias() {
		return this.alias;
	}
}
