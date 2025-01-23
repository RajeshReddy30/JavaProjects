package com.xworkz.tvshow.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="shows")
@NamedQuery(name="findall", query="Select x from TvShowsEntity x")
@NamedQuery(name = "findById", query = "SELECT x FROM TvShowsEntity x WHERE x.id = :id")
@NamedQuery(name = "deleteById", query = "DELETE FROM TvShowsEntity x WHERE x.id = :id")
@NamedQuery(name = "updateById", query = "UPDATE TvShowsEntity x SET x.showName = :showName, x.viewerName = :viewerName, x.viewingTime = :viewingTime, x.actionType = :actionType, x.createdBy = :createdBy, x.createdOn = :createdOn WHERE x.id = :id")

public class TvShowsEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 private String showName;
    private String viewerName;
    private int viewingTime;
    private String actionType;
    private String createdBy;
    private LocalDateTime createdOn;
}
