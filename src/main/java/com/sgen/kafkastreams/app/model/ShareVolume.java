package com.sgen.kafkastreams.app.model;

import com.sgen.kafkastreams.app.pattern.ShareVolumeBuilder;

public class ShareVolume {

	private String symbol;
	private int shares;
	private String industry;

	public ShareVolume(ShareVolumeBuilder builder) {
		this.symbol = builder.getSymbol();
		this.shares = builder.getShares();
		this.industry = builder.getIndustry();
	}

	public String getSymbol() {
		return symbol;
	}

	public int getShares() {
		return shares;
	}

	public String getIndustry() {
		return industry;
	}

	@Override
	public String toString() {
		return "ShareVolume [symbol=" + symbol + ", shares=" + shares + ", industry=" + industry + "]";
	}

}
