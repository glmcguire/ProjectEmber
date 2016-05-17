package com.jedis.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the data database table.
 * 
 */
@Entity
@Table(name="data")
@NamedQuery(name="Data.findAll", query="SELECT d FROM Data d")
public class Data implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dataId;

	private byte flag;

	private double number;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	private String text;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timeCreated;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user")
	@JsonBackReference
	private User user;

	public Data() {
	}

	public int getDataId() {
		return this.dataId;
	}

	public void setDataId(int dataId) {
		this.dataId = dataId;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public double getNumber() {
		return this.number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}