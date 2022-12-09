package com.deva.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mob {
	@Id
	private Integer modelNo;
	private String modelName;
	private String company;
	private Double ram;
	private Double rom;
	private String processor;
	private String os;
	private Long imeiNo;
	private Double price;
	private String manufactureDate;
	//PDC/PPC/PSM/PGM/toString()
	
	public Mob(Integer modelNo, String modelName, String company, Double ram, Double rom, String processor, String os,
			Long imeiNo, Double price, String manufactureDate) {
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.company = company;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.os = os;
		this.imeiNo = imeiNo;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}
	public Mob() {
		super();
	}
	public Integer getModelNo() {
		return modelNo;
	}
	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getRam() {
		return ram;
	}
	public void setRam(Double ram) {
		this.ram = ram;
	}
	public Double getRom() {
		return rom;
	}
	public void setRom(Double rom) {
		this.rom = rom;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Long getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(Long imeiNo) {
		this.imeiNo = imeiNo;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getmanufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String toString() {
		return "Mob [modelNo=" + modelNo + ", modelName=" + modelName + ", company=" + company + ", ram=" + ram
				+ ", rom=" + rom + ", processor=" + processor + ", os=" + os + ", imeiNo=" + imeiNo + ", price=" + price
				+ ", manufactureDate=" + manufactureDate + "]";
	}
	
	}
