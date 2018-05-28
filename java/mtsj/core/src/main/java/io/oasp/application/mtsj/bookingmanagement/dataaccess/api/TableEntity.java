package io.oasp.application.mtsj.bookingmanagement.dataaccess.api;

import javax.persistence.Entity;

import io.oasp.application.mtsj.bookingmanagement.common.api.Table;
import io.oasp.application.mtsj.general.dataaccess.api.ApplicationPersistenceEntity;
//guiude-dataaccess example 1
//https://github.com/oasp/oasp4j/wiki/guide-dataaccess-layer#1n-and-nm-relationships
@Entity
@javax.persistence.Table(name = "Table")
public class TableEntity extends ApplicationPersistenceEntity implements Table {

  private Integer seatsNumber;

  private static final long serialVersionUID = 1L;

  /**
   * @return seatsNumber
   */
  public Integer getSeatsNumber() {

    return this.seatsNumber;
  }

  /**
   * @param seatsNumber new value of {@link #getseatsNumber}.
   */
  public void setSeatsNumber(Integer seatsNumber) {

    this.seatsNumber = seatsNumber;
  }

}
