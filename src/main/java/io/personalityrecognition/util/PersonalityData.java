package io.personalityrecognition.util;

import java.util.HashMap;

public class PersonalityData {
	
	private String userId;
	private double neurotic_score;
	private double openness_score;
	private double conscientiousness_score;
	private double agreeableness_score;
	private double extraversion_score;
	private String neurotic_class;
	private String openness_class;
	private String conscientiousness_class;
	private String agreeableness_class;
	private String extraversion_class;
	private HashMap<String, Integer> wordCounts;
	private HashMap<String, Double> wordFrequencies;
	private int tokenCount;
	
	public PersonalityData() {
		wordCounts = new HashMap<String, Integer>();
		wordFrequencies = new HashMap<String, Double>();
	}
	
	public PersonalityData(String userId) {
		wordCounts = new HashMap<String, Integer>();
		this.userId = userId;
	}
	
	public PersonalityData addToWordCount(String word, int count) {
		if(wordCounts.containsKey(word))
			wordCounts.put(word, wordCounts.get(word) + count);
		else
			wordCounts.put(word, count);
		tokenCount += count;
		return this;
	}
	
	public PersonalityData normalize() {
		for(String word : wordCounts.keySet()) {
			wordFrequencies.put(word, ((double) wordCounts.get(word)) / ((double) tokenCount));
		}
		return this;
	}
	
	public String getUserId() {
		return userId;
	}
	public PersonalityData setUserId(String userId) {
		this.userId = userId;
		return this;
	}
	public double getNeurotic_score() {
		return neurotic_score;
	}
	public PersonalityData setNeurotic_score(double neurotic_score) {
		this.neurotic_score = neurotic_score;
		return this;
	}
	public double getOpenness_score() {
		return openness_score;
	}
	public PersonalityData setOpenness_score(double openness_score) {
		this.openness_score = openness_score;
		return this;
	}
	public double getConscientiousness_score() {
		return conscientiousness_score;
	}
	public PersonalityData setConscientiousness_score(double conscientiousness_score) {
		this.conscientiousness_score = conscientiousness_score;
		return this;
	}
	public double getAgreeableness_score() {
		return agreeableness_score;
	}
	public PersonalityData setAgreeableness_score(double agreeableness_score) {
		this.agreeableness_score = agreeableness_score;
		return this;
	}
	public double getExtraversion_score() {
		return extraversion_score;
	}
	public PersonalityData setExtraversion_score(double extraversion_score) {
		this.extraversion_score = extraversion_score;
		return this;
	}
	public String isNeurotic_class() {
		return neurotic_class;
	}
	public PersonalityData setNeurotic_class(String neurotic_class) {
		this.neurotic_class = neurotic_class;
		return this;
	}
	public String isOpenness_class() {
		return openness_class;
	}
	public PersonalityData setOpenness_class(String openness_class) {
		this.openness_class = openness_class;
		return this;
	}
	public String isConscientiousness_class() {
		return conscientiousness_class;
	}
	public PersonalityData setConscientiousness_class(String conscientiousness_class) {
		this.conscientiousness_class = conscientiousness_class;
		return this;
	}
	public String isAgreeableness_class() {
		return agreeableness_class;
	}
	public PersonalityData setAgreeableness_class(String agreeableness_class) {
		this.agreeableness_class = agreeableness_class;
		return this;
	}
	public String isExtraversion_class() {
		return extraversion_class;
	}
	public PersonalityData setExtraversion_class(String extraversion_class) {
		this.extraversion_class = extraversion_class;
		return this;
	}
	public HashMap<String, Integer> getWordFrequency() {
		return wordCounts;
	}
	public PersonalityData setWordFrequency(HashMap<String, Integer> wordFrequency) {
		this.wordCounts = wordCounts;
		return this;
	}
	public int getTokenCount() {
		return tokenCount;
	}
	public PersonalityData setTokenCount(int tokenCount) {
		this.tokenCount = tokenCount;
		return this;
	}

}
