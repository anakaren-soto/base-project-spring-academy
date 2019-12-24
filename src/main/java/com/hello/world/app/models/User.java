package com.hello.world.app.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuarios")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(length=45)
private String name;
@Column(length=45)
private String lastname;
@Column(length=255)
private String password;
@Column(nullable=false)
private boolean status;
@Column(name="create_date")
@Temporal(TemporalType.TIMESTAMP)
private Date createDate;

@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
@JoinTable(name="users_roles", joinColumns= @JoinColumn(name="id_user"),
inverseJoinColumns=@JoinColumn(name="id_role"),
uniqueConstraints= {@UniqueConstraint(columnNames= {"id_user", "id_role"})})
private List<Role> roles;


public List<Role> getRoles() {
	return roles;
}
public void setRoles(List<Role> roles) {
	this.roles = roles;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
